APP = bin/{{name}}.nw

.PHONY: clean test compile watch run clean-dist compile-test

compile: src/{{name}} clean
	lein cljsbuild once {{name}}

build: compile
	cd deploy && npm install
	cd deploy && zip -r ../$(APP) *
ifeq ($(shell uname), Linux)
	`which nw` $(APP)
else
	open -n -a node-webkit $(APP)
endif

dist: clean-dist
	cd deploy && zip -r ../$(APP) * -x "node_modules/.bin/*"

watch:
	lein cljsbuild auto cljstests &

compile-test: tests
	lein cljsbuild once cljstests
	cd deploy && npm install

test:
	cd deploy && node_modules/.bin/mocha --reporter=spec

run:
ifeq ($(shell uname), Linux)
	`which nw` $(APP)
else
	open -n -a node-webkit $(APP)
endif

clean: clean-dist
	lein cljsbuild clean

clean-dist:
	rm -f $(APP)
