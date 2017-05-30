package kosta.travel.domain;

public class Criteria {

  private int page; //���� ��ȸ�ϴ� �������� ��ȣ
  private int perPageNum; //�� �������� ����ϴ� �������� ����

  public Criteria() {
    this.page = 1;
    //�������� �������� �۰���
    this.perPageNum = 3;
  }

  public void setPage(int page) {

    if (page <= 0) {
      this.page = 1;
      return;
    }

    this.page = page;
  }

  public void setPerPageNum(int perPageNum) {

    if (perPageNum <= 0 || perPageNum > 100) {
      this.perPageNum = 10;
      return;
    }

    this.perPageNum = perPageNum;
  }

  public int getPage() {
    return page;
  }

  //���������� �����ϴ� ��
  // method for MyBatis SQL Mapper -
  public int getPageStart() {

    return (this.page - 1) * perPageNum;
  }

  // method for MyBatis SQL Mapper
  public int getPerPageNum() {

    return this.perPageNum;
  }

  @Override
  public String toString() {
    return "Criteria [page=" + page + ", "
        + "perPageNum=" + perPageNum + "]";
  }
}