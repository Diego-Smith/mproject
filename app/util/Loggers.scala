package util

trait MProjectLogger {
  private val LOG_ROW_PREFIX = "mLog :: "
  private val LOG_PREFIX = "----\n"
  private val LOG_POSTFIX = LOG_PREFIX
  def mLog(stringToLog: String) = {
    System.out.println(
      stringToLog.split("\n").map(s => s.mkString(LOG_ROW_PREFIX, "", "\n")).mkString(LOG_PREFIX, "", LOG_POSTFIX))
  }
}

trait OttoliniLogger {
  private val LOG_PREFIX = "**ottoCulo** "
  def mLog(stringToLog: String) = {
    System.out.println(
      stringToLog.split("\n").map(s => s.mkString(LOG_PREFIX, "", "\n")).mkString("---->>>>>>>>\n", "", "<<<<<<<<----\n"))
  }
}
