import style from './TabsBar.module.css'

function TabsBar() {
      return (
            <div
                  className={style.tabsBar}
            >
                  <button
                        className={style.tab}
                  >
                        User one
                  </button>
                  <button
                        className={style.tab}
                  >
                        User two
                  </button>
            </div>
      );
}

export default TabsBar;