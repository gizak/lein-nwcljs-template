(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"
                  :exclusions [org.apache.ant/ant]]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src"]
  :cljsbuild {:builds [{:id "{{name}}"
                        :source-paths ["src"]
                        :compiler {:output-dir "deploy/node_modules/{{name}}"
                                   :output-to "deploy/node_modules/{{name}}/bootstrap.js"
                                   :source-map "deploy/node_modules/{{name}}/bootstrap.js.map"
                                   :optimizations :simple
                                   :pretty-print true}}
                       {:id "cljstests"
                        :source-paths ["tests"]
                        :compiler {:output-dir "deploy/node_modules/cljstests/"
                                   :output-to "deploy/node_modules/cljstests/cljstests.js"
                                   :optimizations :none}}
                       {:id "{{name}}-dev"
                        :source-paths ["src"]
                        :compiler {:output-dir "deploy/node_modules/cljsdev/"
                                   :optimizations :none}}]})
