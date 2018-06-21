module.exports = {
    entry: {
        app: './src/app.js',
        user: './user/test.js'
    },
    output: {
        filename: '[name].bundle.js',
        path: __dirname + '/dist'
    },
    devtool: 'source-map',
    mode: 'development',
    devServer: {
        contentBase: __dirname + "/dist",
        watchContentBase: true,
        compress: true,
        port: 8080
    }
};