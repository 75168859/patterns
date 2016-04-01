package com.miiceic.refactor.pattern.single;

public enum A {
	X(){

		@Override
		A nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	},Y(){

		@Override
		A nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	},Z(){

		@Override
		A nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	};
	abstract A nextDay();
	
}
