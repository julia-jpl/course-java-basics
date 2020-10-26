package com.rakovets.course.javabasics.practice.generics;

public class Math<T> {
    T[] numbers;

    public Math () {
    }

    public Math (T[] nums) {
        numbers = nums;
    }

    public static <T extends Comparable<T>> T getMax(T type1, T type2, T type3) {
        T maxType = type1;
        if (type1.compareTo(type2) > 0) {
            if (type1.compareTo(type3) > 0) {
                maxType = type1;
            } else {
                maxType = type3;
            }
        } else if (type1.compareTo(type2) < 0) {
            if (type2.compareTo(type3) > 0) {
                maxType = type2;
            } else {
                maxType = type3;
            }
        } else if (type1.compareTo(type2) == 0) {
            if (type2.compareTo(type3) > 0) {
                maxType = type2;
            } else if (type2.compareTo(type3) < 0) {
                maxType = type3;
            } else {
                maxType = null;
            }
        } return maxType;
    }

    public static <T extends Comparable<T>> T getMin(T type1, T type2, T type3, T type4, T type5) {
        T minType = type1;
        if (type1.compareTo(type2) < 0) {
            if (type1.compareTo(type3) < 0) {
                if (type1.compareTo(type4) < 0) {
                    if (type1.compareTo(type5) < 0) {
                        minType = type1;
                    } else {
                        minType = type5;
                    }
                } else if (type4.compareTo(type5) < 0) {
                    minType = type4;
                } else {
                    minType = type5;
                }
            } else if (type3.compareTo(type4) < 0) {
                if (type3.compareTo(type5) < 0) {
                    minType = type3;
                } else {
                    minType = type5;
                }
            } else if (type4.compareTo(type5) < 0) {
                minType = type4;
            } else {
                minType = type5;
            }
        } else if (type2.compareTo(type3) < 0) {
            if (type2.compareTo(type4) < 0) {
                if (type2.compareTo(type5) < 0) {
                    minType = type2;
                } else {
                    minType = type5;
                }
            } else if (type4.compareTo(type5) < 0) {
                minType = type4;
            } else {
                minType = type5;
            }
        } else if (type3.compareTo(type4) < 0) {
            if (type4.compareTo(type5) < 0) {
                minType = type4;
            } else {
                minType = type5;
            }
        } else if (type4.compareTo(type5) < 0) {
            minType = type4;
        } else {
            minType = type5;
        }
        if ((type1.compareTo(type2) == 0) &&
                (type2.compareTo(type3) == 0) &&
                (type3.compareTo(type4) == 0) &&
                (type4.compareTo(type5) == 0) &&
                (type1.compareTo(type5) == 0)) {
            minType = null;
        } return minType;
    }

    public <T extends Number> double getAverage(T[] nums) {
        double sum = 0;
        double average = 0;
        for (T num : nums) {
            sum += num.doubleValue();
            average = sum / nums.length;
        }
        return average;
    }

    public <T extends Comparable<T>> T getMaxInArray(T[] nums) {
        T maxInArray = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxInArray.compareTo(nums[i]) < 0) {
                maxInArray = nums[i];
            }
        } return maxInArray;
    }

    public <T extends Comparable<T>> T getMinInArray(T[] nums) {
        T minInArray = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (minInArray.compareTo(nums[i]) > 0) {
                minInArray = nums[i];
            }
        } return minInArray;
    }

    public <T extends Comparable <T>> T[] getSortArray(T[] marks) {
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < (marks.length - 1); j++) {
                if (marks[j].compareTo(marks[j + 1]) > 0) {
                    T temple = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temple;
                }
            }
        } return marks;
    }

    public <T extends Comparable<T>> int getBinarySearch(T[] marks, T mark) {
        int left = 0;
        int right = marks.length - 1;
        int mid = 0;
        int index = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < (marks.length - 1); j++) {
                if ((marks[j].compareTo(marks[j + 1])) > 0) {
                    T temple = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temple;
                }
            }
        }
        if (marks.length == 0) {
            index = -1;
        } else {
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (marks[mid].compareTo(mark) == 0) {
                    index = mid;
                    break;
                } else if (marks[mid].compareTo(mark) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    index = -1;
                }
            }
        }
        return index;
    }
}


