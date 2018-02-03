
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/dev/ideaworks/Market/conf/routes
// @DATE:Sat Feb 03 13:29:55 CST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
