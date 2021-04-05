//
//  CircleImage.swift
//  ornacompanion
//
//  Created by Bryan de Ridder on 03/04/2021.
//

import SwiftUI

struct CircleImage: View {
    var image: Image
    
    var body: some View {
        image
            .clipShape(Circle())
            .shadow(radius: 7)
            .overlay(Circle().stroke(Color.white, lineWidth: 4))
    }
}

struct CircleImage_Previews: PreviewProvider {
    static var previews: some View {
        CircleImage(image: Image("turtlerock"))
    }
}
