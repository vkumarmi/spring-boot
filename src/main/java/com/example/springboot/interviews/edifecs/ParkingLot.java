package com.example.springboot.interviews.edifecs;

import java.util.*;

/**
     * A Parking lot has 5 levels
     * Each level has 50 rows
     * Each row has 50 parking spaces
     *
     * Allot parking space to incoming cars.
     * Free up parking space based upon exiting cars.
     *
     * There is one entry gate.
     * There is one exit gate.
     *
 * getSlot-
 *
 * table - booking table - id, slot_id  , RC_No
 *         Slots table -   id, lot,  Lot_id, level, row, slot
 *          Lot - id, name, address, capacity
 *
     */
    public class ParkingLot {

        private static final int MAX_LEVEL=5;
        private static final int MAX_ROWS=50;
        private static final int MAX_SPACE=50;

        Map<String,ParkingSlot> booked=new HashMap<>();

        Queue<ParkingSlot> available=new PriorityQueue<>(Comparator.comparing(parkingSlot -> parkingSlot.distance));

        public ParkingLot(){
            for (int i=1;i<=MAX_LEVEL;i++){

            }
        }
        /**
         *
         * @param carNumber of car entering the parking lot
         * @return parkingSpace e.g level-row-space
         */
        public synchronized ParkingSlot carEntry(final String carNumber) {
// TODO find parking space
          if(booked.containsKey(carNumber)){
              throw new RuntimeException("Car is already parked ");
          }
          if(available.isEmpty()){
              throw new RuntimeException("Parking is full");
          }
          ParkingSlot slot=available.poll();

              booked.put(carNumber, slot);

          return slot;
        }


        public  void carExit(final String carNumber) {
            if(!booked.containsKey(carNumber)){
                throw new RuntimeException("Car is not present");
            }
            ParkingSlot slot=booked.get(carNumber);
            booked.remove(carNumber);
            available.add(slot);
        }


    private int getDistanceFromGate(String parkingSpace) {
// assume this method is already implemented
        return 1;
    }
    }

    class ParkingSlot{

         String  level;

         String row;

         String slot;

          double distance;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParkingSlot that = (ParkingSlot) o;
            return Objects.equals(level, that.level) && Objects.equals(row, that.row) && Objects.equals(slot, that.slot);
        }

        @Override
        public int hashCode() {
            return Objects.hash(level, row, slot);
        }
    }

