package com.example.mcpserverremote.config;

import com.example.mcpserverremote.tool.HelpDeskTools;
import java.util.List;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpServerConfig {
  @Bean
  List<ToolCallback> toolCallbacks(HelpDeskTools helpDeskTools) {
    return List.of(ToolCallbacks.from(helpDeskTools));
  }
}
