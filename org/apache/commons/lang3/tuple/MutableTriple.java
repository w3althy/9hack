package org.apache.commons.lang3.tuple;

public class MutableTriple<L, M, R> extends Triple<L, M, R> {
   public static final MutableTriple<?, ?, ?>[] EMPTY_ARRAY = new MutableTriple[0];
   private static final long serialVersionUID = 1L;
   public L left;
   public M middle;
   public R right;

   public static <L, M, R> MutableTriple<L, M, R>[] emptyArray() {
      return (MutableTriple[])EMPTY_ARRAY;
   }

   public static <L, M, R> MutableTriple<L, M, R> of(L left, M middle, R right) {
      return new MutableTriple(left, middle, right);
   }

   public MutableTriple() {
   }

   public MutableTriple(L left, M middle, R right) {
      this.left = left;
      this.middle = middle;
      this.right = right;
   }

   public L getLeft() {
      return this.left;
   }

   public M getMiddle() {
      return this.middle;
   }

   public R getRight() {
      return this.right;
   }

   public void setLeft(L left) {
      this.left = left;
   }

   public void setMiddle(M middle) {
      this.middle = middle;
   }

   public void setRight(R right) {
      this.right = right;
   }
}
