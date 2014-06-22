(ns {{name}}.tests.hello
  (:require [cljs.nodejs :as nodejs]
            [{{name}}.bootstrap :as bt]))

(def log #(.log js/console %))
(def asst (nodejs/require "assert"))


(defn hello []
  (log "greetings from {{name}}.tests.hello"))

(js/describe "Running cljs tests in cljs"
             (fn []
               (js/it "should be invokable"
                           (fn [] (.equal asst 1 1)))
               (js/it "can call functions from other packages"
                           (fn [] (.equal asst (bt/hello) "greetings from {{name}}.bootstrap")))))
