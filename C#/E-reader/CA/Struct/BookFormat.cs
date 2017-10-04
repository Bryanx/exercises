namespace CA.Struct {
    public enum BookFormat : byte {
        EPUB = 0, // default
        PDF,
        TXT,
        CBR // 'Comic Book Archive' (collection of images compressed as RAR)
    }
}