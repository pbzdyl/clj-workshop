(ns clj-workshop.utils)

(defn unavailable-fn
  [name]
  (fn [& _] (throw (ex-info (str name " cannot be used in the solution") {}))))
