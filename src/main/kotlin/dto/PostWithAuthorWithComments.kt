package dto

data class PostWithAuthorWithComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>,
)
