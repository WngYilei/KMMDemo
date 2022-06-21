import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()
    @State var  str:String="数据"
    
	var body: some View {
        Button(action:{
            print("获取数据")
            Greeting().test { (data) in
                print(data)
                str = data
            }
           
        }){
            Text("获取数据")
        }
        
        Text(str)
	
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
