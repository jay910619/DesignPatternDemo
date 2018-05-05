package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/5/5 下午12:59
 * @desc 创维电视机
 */

public class SkyworthTelevision implements Television {
    private Object[] objects = {"CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4", "CCTV-5", "CCTV-6", "CCTV-7"};

    @Override
    public TVIterator createIterator() {
        return new SkyworthIterator();
    }


    private class SkyworthIterator implements TVIterator {

        private int currentIndex = 0;

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
            return currentIndex == objects.length;
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }

        @Override
        public Object currentChannel() {
            return objects[currentIndex];
        }
    }
}
