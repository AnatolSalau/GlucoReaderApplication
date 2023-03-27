import style from "../PrintWindow/PrintWindow.module.css";

function PrintWindow() {
      console.log(style.printWindow)
      return(
            <div
                  className={style.printWindow}
            >
                  PrintWindow
            </div>
      )
}

export default PrintWindow;