APP = bin/{{name}}.nw

.PHONY: clean test run build deps 
deps:
	cd build && npm install

build: clean
	lein cljsbuild once {{name}}
	cd build && zip -r ../$(APP) *

clean:
	lein cljsbuild clean
	rm -f $(APP)

run:
ifeq ($(shell uname), Linux)
	`which nw` $(APP)
else
	open -n -a node-webkit $(APP)
endif

test:
	lein cljsbuild once cljstests
	cd build && node_modules/.bin/mocha --reporter=spec


