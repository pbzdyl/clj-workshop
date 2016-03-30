(ns clj-workshop.func-prog
  (:require [clj-workshop.utils :refer :all]))

;; Anonymous functions

(fn [a]
  (+ a 5))

#(+ % 5)

(fn [a1 a2 a3])

#(+ % %2 %3)

#(+ %1 %2 %3)

#(+ %5 %7)

;; Useful functions

(range 5)
(range 5 10)
(range 5 20 3)

(reverse (range 5 10))

(take 10 (range 1000))

(drop 3 (range 10))

(take-while #(< %10)
            (range 100))

(drop-while #(< % 10)
            (range 20))

(filter even? (range 10))

(remove even? (range 10))

(some even? [1 2 3])

(some even? [1 3 5])

(every? even? [1 2 3])

(every? even? [2 4])

(map even? (range 10))

(map nil? [1 nil true false])

(map inc [1 2 3])

(map :type
     [{:name "John"}
      {:name "Joe"}])

(map (fn [a b]
       (println "a" a "b" b))
     [:x :y]
     [1 2])

(sort [2 4 1 6 7])
(sort-by :name
         [{:name "John"}
          {:name "Adam"}
          {:name "Paul"}])

(frequencies [1 2 3 2 1 1])
(group-by
 :count
 [{:n "a" :count 10}
  {:n "b" :count 100}
  {:n "c" :count 10}])

;; Threading macros

(sort
 (map
  str
  (filter
   even?
   (range 10))))

(as-> 10 it
      (range it)
      (filter even? it)
      (map str it)
      (sort it))

(it-> 10
      (range it)
      (filter even? it)
      (map str it)
      (sort it))

(->> 10
    (range)
    (filter even?)
    (map str)
    (sort))
