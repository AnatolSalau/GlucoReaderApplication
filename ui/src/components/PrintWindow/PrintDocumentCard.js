import style from '../PrintWindow/PrintDocumentCard.module.css'

function PrintDocumentCard({children}) {
      return (
            <div className={style.printDocumentCard}>
                  <div className={style.printDocumentCardWrapper}>
                        <div className={style.pageTitle}>
                              <div className={style.pageTitleRow}>
                                    Результат измерений уровня глюкозы в крови
                              </div>
                              <div className={style.pageTitleRow}>
                                    <div className={style.bold}>
                                          Фамилия Имя Отчество
                                    </div>
                                    , 00 лет
                              </div>
                              <div className={style.pageTitleRow}>
                                    за период
                                    <div className={style.bold}>
                                          с 00.00.0000 по 00.00.0000
                                    </div>
                              </div>
                        </div>
                        <div className={style.pageRow}>
                              <div className={style.pageRowContent}>
                                    Документ сформирован 00.00.0000 в 00.00
                              </div>

                        </div>
                        {children}
                  </div>
            </div>
      );
}

export default PrintDocumentCard;