(ns bowling-kata.game-test
  (:require [clojure.test :refer :all]
            [bowling-kata.game :refer :all]))

(deftest score-tests
  (testing "all zeros return 0"
    (is (= 0 (score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0]))))
  (testing "all 10s give 300"
    (is (= 300 (score [10 10 10 10 10 10 10 10 10 10 10 10]))))
  (testing "some lucky shots should be added correctly"
    (is (= 4 (score [0 0 0 0 0 1 0 0 0 1 0 0 0 0 0 0 1 1 0 0]))))
  (testing "should correctly calculate spare"
    (is (= 20 (score [0 0 0 0 0 0 0 0 0 0 4 6 5 0 0 0 0 0 0 0]))))
  (testing "should correctly calculate strike"
    (is (= 24 (score [0 0 0 0 0 0 0 0 0 0 10 5 2 0 0 0 0 0 0]))))
  (testing "should correctly calculate spare at the end"
    (is (= 15 (score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 9 5]))))
  (testing "should correctly calculate strike at the end"
    (is (= 17 (score [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 10 5 2])))))
