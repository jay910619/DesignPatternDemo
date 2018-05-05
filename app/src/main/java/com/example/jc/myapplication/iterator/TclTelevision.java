package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/5/5 下午1:04
 * @desc Tcl电视机 可以循环一次
 */

public class TclTelevision implements Television {
    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TVIterator {

        private Object[] objects = {"湖南卫视", "北京卫视", "浙江卫视", "上海卫视", "江苏卫视", "安徽卫视", "湖北卫视"};


        private int currentIndex = 0;


        boolean isFirst = true;
        boolean isLast = true;
        

        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public void next() {
            if (currentIndex < objects.length) {
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if (currentIndex > 0) {
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            if (currentIndex == objects.length) {
                if (isLast) {
                    currentIndex = 0;
                    isLast = false;
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            if (currentIndex == 0) {
                if (isFirst) {
                    currentIndex = objects.length-1;
                    isFirst = false;
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override
        public Object currentChannel() {
            return objects[currentIndex];
        }
    }

}
