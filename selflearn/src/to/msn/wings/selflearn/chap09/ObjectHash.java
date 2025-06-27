package to.msn.wings.selflearn.chap09;

public class ObjectHash {
  private boolean boolValue;
  private int intValue;
  private long longValue;
  private float floatValue;
  private double doubleValue;
  private String stringValue;
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (boolValue ? 1231 : 1237);
    long temp;
    temp = Double.doubleToLongBits(doubleValue);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + Float.floatToIntBits(floatValue);
    result = prime * result + intValue;
    result = prime * result + (int) (longValue ^ (longValue >>> 32));
    result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ObjectHash other = (ObjectHash) obj;
    if (boolValue != other.boolValue)
      return false;
    if (Double.doubleToLongBits(doubleValue) != Double.doubleToLongBits(other.doubleValue))
      return false;
    if (Float.floatToIntBits(floatValue) != Float.floatToIntBits(other.floatValue))
      return false;
    if (intValue != other.intValue)
      return false;
    if (longValue != other.longValue)
      return false;
    if (stringValue == null) {
      if (other.stringValue != null)
        return false;
    } else if (!stringValue.equals(other.stringValue))
      return false;
    return true;
  }
}
