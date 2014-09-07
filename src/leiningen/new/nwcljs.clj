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
             ["test/hello.cljs" (render "test/hello.cljs" data)]
             ["test/hi.cljs" (render "test/hi.cljs" data)]
             ["src/{{sanitized}}/bootstrap.cljs" (render "src/bootstrap.cljs" data)]
             ["build/index.html" (render "build/index.html" data)]
             ["build/package.json" (render "build/package.json" data)]
             ["build/test/index.js" (render "build/test/index.js" data)]
             ["build/goog" (render "build/goog" data)]
             "build/node_modules"
             "bin")))
