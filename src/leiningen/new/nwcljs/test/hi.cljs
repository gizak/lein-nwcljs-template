(ns test.hi
  (:require [cljs.nodejs :as nodejs]))

(def log #(.log js/console %))

(defn hi []
  (log "Hi!"))
