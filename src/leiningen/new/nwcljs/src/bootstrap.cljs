(ns {{name}}.bootstrap
    (:require [cljs.nodejs :as nodejs]))

(def log #(.log js/console %))

(defn hello []
  (identity "greetings from {{name}}.bootstrap"))

(defn boot []
  "main entry of program" (log (hello)))
