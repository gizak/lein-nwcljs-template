# nwcljs 
![Clojars Project](http://clojars.org/nwcljs/lein-template/latest-version.svg)

A Leiningen template for building node-webkit app out of box. Embrace ClojureScript and node js techniques in front & back end developing.

![basics](https://www.dropbox.com/s/rw5wytbo35px36h/output_WXrokU.gif?raw=1)

## Environment

nwcljs leverages GUN make system and contains some *nix specific codes, so currently this is only for Linux and Mac OS X users, but all-platform version is on its way!

## Usage

__Getting started__

`make`: install dependencies.

`make build`: compile ClojureScript code and zip it into a node-webkit app!

`make run`: run the app just built.

`make test`: run clojure-style mocha tests to check backend functionality!

A say-hello demo:

![app](https://docs.google.com/uc?export=download&id=0B0cTXPTvmr_UVXpBdk5kU1RmcDg)

## TODOs

1. All platforms compitable code in Makefile

## License

Copyright © 2014 @gizak

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
