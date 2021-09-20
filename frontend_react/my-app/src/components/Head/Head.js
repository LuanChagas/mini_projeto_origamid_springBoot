import React from "react";

const Head = (props) => {
  React.useEffect(() => {
    const description = props.description;
    document.title = props.title;
    document
      .querySelector('meta[name="description"]')
      .setAttribute("content", description);
  }, [props]);
  return <></>;
};

export default Head;
