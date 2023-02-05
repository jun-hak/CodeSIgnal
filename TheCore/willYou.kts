fun solution(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {
    return (young && beautiful) && !loved || (loved && (!young || !beautiful))
  }
  