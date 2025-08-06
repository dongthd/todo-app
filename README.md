# TodoApp Spring Boot App

## Mô tả
Ứng dụng đơn giản quản lý danh sách công việc sử dụng Spring Boot (chưa kết nối CSDL).

## Cách chạy ứng dụng

1. Chạy class `TodoAppApplication`
2. Kiểm tra console để thấy danh sách công việc được in ra

## Cấu trúc chính
- `model/Task.java`: Định nghĩa công việc
- `service/TaskService.java`: Xử lý nghiệp vụ
- `repository/TaskRepository.java`: Quản lý danh sách (List tạm)
- `controller/TaskPrinter.java`: In ra console khi ứng dụng start
- `config/PrototypeBean.java`: Minh họa vòng đời và scope của Bean
- `config/SingletonBean.java`: Minh họa vòng đời và scope của Bean

## Cấu hình
- Port: `8081`
- Profile: `dev`, `prod` (mô phỏng)

## Ghi chú
- Hiện chưa kết nối CSDL
