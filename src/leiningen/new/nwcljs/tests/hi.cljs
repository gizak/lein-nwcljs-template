(ns {{name}}.tests.hi
  (:require [cljs.nodejs :as nodejs]))

(def log #(.log js/console %))

(defn hi []
  (log "Hi!"))
