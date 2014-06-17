APP = bin/{{name}}.nw

compile: src/{{name}}/* clean
	@lein cljsbuild once {{name}}

cli:
	@node deploy/node_modules/{{name}}/bootstrap.js

build: compile clean
	@cd deploy && npm install
	@cd deploy && zip -r ../$(APP) *
ifeq ($(shell uname), Linux)
	`which nw` $(APP)
else
	open -n -a node-webkit $(APP)
endif

dist: cleandist
	@cd deploy && zip -r ../$(APP) *

test:
	@lein cljsbuild once cljstests
	@cd deploy && mocha --reporter=spec

run:
ifeq ($(shell uname), Linux)
	`which nw` $(APP)
else
	open -n -a node-webkit $(APP)
endif

clean: cleandist
	@lein cljsbuild clean

cleandist:
	@rm -f $(APP)

.PHONY: clean test bin cli
