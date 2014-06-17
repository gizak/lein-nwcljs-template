# nwcljs

A Leiningen template for building node-webkit app out of box. Embrace ClojureScript and node js techniques in front & back end developing.

## Environment

nwcljs leverages GUN make system and contains some *nix specific codes, so currently this is only for Linux and Mac OS X users, but all-platform version is on its way!

## Usage

__Getting started__

Directly call `lein new nwcljs example` to create an example app. This will yeild some files as following:
![tree](https://docs.google.com/uc?export=download&id=0B0cTXPTvmr_UTlBUY3BseXZUd0E)

__Testing__

Run `make test` in the project root dir will invoke the testing procedure: compile cljs code into js file using test-spec config, and run a bootstrap file to eval the js file under mocha environment. Don't worry, everything is automatic. All you need to do is writing your test case file in ClojureScript favor!

![test](https://docs.google.com/uc?export=download&id=0B0cTXPTvmr_UYmd0OWFVNnFqMnc)

__Building node-webkit app__

Simply type `make build` to wrap up everything into your node-webkit app:

![build](https://docs.google.com/uc?export=download&id=0B0cTXPTvmr_UYVJrNXhWZm8wODg)

A say-hello demo:

![app](https://docs.google.com/uc?export=download&id=0B0cTXPTvmr_UVXpBdk5kU1RmcDg)

## TODOs

1. Right now the testing compile mode is set as :simple which takes a lot of time in progress. The next step is using :none optimazition to speed up developing test.
2. All platforms compitable code in Makefile

## License

Copyright © 2014 @gizak

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
