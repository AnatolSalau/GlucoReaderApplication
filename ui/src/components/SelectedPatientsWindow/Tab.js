import style from './Tab.module.css'

function Tab({children}) {
      return (
            <div
                  className={style.tab}
            >
                  {children}
            </div>
      )
}

export default Tab;