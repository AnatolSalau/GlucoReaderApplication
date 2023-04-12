import style from '../PrintWindow/PrintDocumentCard.module.css'

function PrintDocumentCard({children}) {
      return (
            <div className={style.printDocumentCard}>
                  PrintDocumentCard
                  {children}
            </div>
      );
}

export default PrintDocumentCard;