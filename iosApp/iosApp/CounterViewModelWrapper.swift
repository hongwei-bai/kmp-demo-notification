import shared

class CounterViewModelWrapper: ObservableObject {
    private let viewModel = CounterViewModel()

    @Published var count: Int = 0

    private var job: Kotlinx_coroutines_coreJob? = nil

    init() {
        job = viewModel.count.watch { [weak self] newValue in
            self?.count = newValue?.intValue ?? 0
        }
    }

    deinit {
        job?.cancel()
        viewModel.onCleared()
    }

    func increment() {
        viewModel.increment()
    }

    func decrement() {
        viewModel.decrement()
    }
}