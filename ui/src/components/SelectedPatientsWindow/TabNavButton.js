import style from './TabNavButton.module.css'

function TabNavButton({children}) {
      return (
            <div
                  className={style.tabNavButton}
            >
                  {children}
            </div>
      )
}

export default TabNavButton;