package GenerateCodeLib;

public class Logic3 {
/* unknownVal is true if the Logic3 value is unknown, false otherwise */
	private boolean unknownVal;
	/* when unknownVal is false the Logic3 value is true or false
	depending on the value of TFVal */
	private boolean TFVal;
	public Logic3(boolean u, boolean tf) {
		unknownVal=u;
		TFVal=tf;
	}
	public Logic3(Logic3 lg) {
		unknownVal=lg.getUnknownVal();
		TFVal=lg.getTFVal();
	}
	public Logic3(boolean b) {
		unknownVal=false;
		TFVal=b;
	}
	public boolean getUnknownVal(){
		return this.unknownVal;
	}
	public boolean getTFVal(){
		return this.TFVal;
	}
	/* Returns true if the Logic3 value represented by this object is unknown */
	public boolean isUnknown() {
		return unknownVal;
	}
	/* Returns true if the Logic3 value represented by this object is true */
	public boolean isTrue() {
		return !unknownVal && TFVal;
	}
	/* Returns true if the Logic3 value represented by this object is false */
	public boolean isFalse() {
		return !unknownVal && !TFVal;
	}
	/* Implements the and operator between this object and the argument */
	public Logic3 and3(Logic3 op) {
		if (this.isFalse() || op.isFalse())
			return new Logic3(false, false);
		if (this.isTrue() && op.isTrue())
			return new Logic3(false, true);
		return new Logic3(true, true);
	}
	/* Implements the or operator between this object and the argument */
	public Logic3 or3(Logic3 op) {
		if (this.isTrue() || op.isTrue())
			return new Logic3(false, true);
		if (this.isFalse() && op.isFalse())
			return new Logic3(false, false);
		return new Logic3(true, true);
	}
	/* Implements the not operator for this object */
	public Logic3 not3() {
		if (this.isUnknown())
			return this;
		return new Logic3(false, !TFVal);
	}
	public boolean isEquals(Logic3 lg){
		if((this.TFVal==lg.getTFVal())&&(this.unknownVal==lg.getUnknownVal())){
			return true;
		}else{
			return false;
		}
	}
}