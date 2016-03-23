(ns clj-workshop.coll-contains-test
  (:require [clj-workshop.coll-contains :refer :all]
            [clj-workshop.utils :refer :all]
            [clojure.test :refer :all]))

#_(deftest coll-contains
  (with-redefs [reduce (unavailable-fn "reduce")
                map (unavailable-fn "reduce")
                filter (unavailable-fn "reduce")
                contains? (unavailable-fn "contains?")]

    (is (true? (coll-contains? [1 2 3 :a] 2)))
    (is (true? (coll-contains? [1 2 :a 3] :a)))
    (is (false? (coll-contains? nil 3)))
    (is (true? (coll-contains? [1 2 nil false] nil)))
    (is (true? (coll-contains? [1 2 false 3] false)))
    (is (true? (coll-contains? [1 :a 2 :b] :b)))))
