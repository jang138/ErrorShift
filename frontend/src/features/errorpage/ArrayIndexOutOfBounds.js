import Footer from '../../common/footer/Footer'
import SideBar from '../../common/sidebar/SideBar'

function ArrayIndexOutOfBounds(){
    return(
        <div>
            <div className="overall-screen">
                <div>
                    <SideBar></SideBar>
                </div>
                <div style={{height:500, marginTop:80}}>
                    <h1>ArrayIndexOutOfBounds</h1>
                </div>
            </div>
            <Footer></Footer>
        </div>
    )
}
export default ArrayIndexOutOfBounds;