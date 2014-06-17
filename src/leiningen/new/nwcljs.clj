(ns leiningen.new.nwcljs
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "nwcljs"))

(defn nwcljs
  "create a hello world node-webkit app out of box"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' nwcljs project.")
    (->files data
             [".gitigorne" (render ".gitignore" data)]
             ["Makefile" (render "Makefile" data)]
             ["project.clj" (render "project.clj" data)]
             ["tests/hello.cljs" (render "tests/hello.cljs" data)]
             ["src/{{sanitized}}/bootstrap.cljs" (render "src/bootstrap.cljs" data)]
             ["deploy/index.html" (render "deploy/index.html" data)]
             ["deploy/package.json" (render "deploy/package.json" data)]
             ["deploy/test/index.js" (render "deploy/test/index.js" data)]
             "deploy/node_modules"
             "bin")))
