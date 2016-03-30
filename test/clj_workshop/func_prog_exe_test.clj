(ns clj-workshop.func-prog-exe-test
  (:require [clj-workshop.func-prog-exe :as ut]
            [clojure.test :refer :all]))

(def candidates
  [{:id 1
    :name "John Doe"
    :rating 7}
   {:id 2
    :name "Adam Smith"
    :rating 3}
   {:id 3
    :name "Julia Jones"
    :rating 9}])

#_(deftest count-chars-test
  (is (= 5 (ut/count-chars "abracadabra" \a)))
  (is (= 0 (ut/count-chars "" \a)))
  (is (= 0 (ut/count-chars nil \a))))

#_(deftest candidate-names-test
  (is (= ["John Doe" "Adam Smith" "Julia Jones"] (ut/candidate-names candidates))))

#_(deftest candidates-with-minimum-rating-test
  (is (= [{:id 3 :name "Julia Jones" :rating 9}]
         (ut/candidates-with-minimum-rating 8 candidates))))

#_(deftest palindrome-test
  (is (true? (ut/palindrome? "kajak")))
  (is (true? (ut/palindrome? "kobylamamalybok")))
  (is (true? (ut/palindrome? [1 2 3 2 1])))
  (is (false? (ut/palindrome? [1 2])))
  (is (false? (ut/palindrome? "palindrom?"))))

#_(deftest count-palindromes-test
  (is (= 1 (ut/count-palindromes 0 1)))
  (is (= 199 (ut/count-palindromes 0 10000))))

#_(deftest flip-flop-test
  (is (= [2 2 4 4 6 6] (ut/flip-flop [1 2 3 4 5 6])))
  (is (= [2] (ut/flip-flop [1])))
  (is (= [] (ut/flip-flop []))))
