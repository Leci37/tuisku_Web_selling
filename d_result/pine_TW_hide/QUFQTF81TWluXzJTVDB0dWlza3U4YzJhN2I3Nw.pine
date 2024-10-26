//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AAPL_5Min_2ST0_8c2a7b77 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_2ST0_8c2a7b77", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_8c2a7b77(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 59.079 )
		if( ema3 <= 176.461 )
			if( d <= 51.5979 )
				if( d <= 4.13286 )
					if( ema2 <= 164.699 )
						if( ema13 <= -0.271224 )
							ret := -0.941176 // sell
						if( ema13 > -0.271224 )
							ret := -0.769231 // sell
					if( ema2 > 164.699 )
						if( tema <= 164.267 )
							ret := 1.000000 // buy
						if( tema > 164.267 )
							if( ema1 <= 171.429 )
								if( d_k <= 1.72693 )
									ret := -0.038911
								if( d_k > 1.72693 )
									ret := 0.592105
							if( ema1 > 171.429 )
								if( ema13 <= -0.217016 )
									ret := 0.494048
								if( ema13 > -0.217016 )
									ret := 0.185882
				if( d > 4.13286 )
					if( k <= 3.24717 )
						if( rsi1 <= 51.7635 )
							if( k <= 0.022787 )
								if( d_k <= 11.1674 )
									ret := -0.239726
								if( d_k > 11.1674 )
									ret := 0.311828
							if( k > 0.022787 )
								if( ema12 <= -0.393397 )
									ret := 0.906977 // buy
								if( ema12 > -0.393397 )
									ret := 0.338776
						if( rsi1 > 51.7635 )
							if( tema <= 167.849 )
								ret := 0.900000 // buy
							if( tema > 167.849 )
								if( smoothK_k <= -0.874165 )
									ret := -0.611111
								if( smoothK_k > -0.874165 )
									ret := 0.230769
					if( k > 3.24717 )
						if( rsi1 <= 19.1138 )
							if( d_k <= 9.049 )
								if( ema1 <= 174.052 )
									ret := -0.213333
								if( ema1 > 174.052 )
									ret := -0.767857 // sell
							if( d_k > 9.049 )
								if( ema2 <= 174.312 )
									ret := 0.444444
								if( ema2 > 174.312 )
									ret := 0.888889 // buy
						if( rsi1 > 19.1138 )
							if( ema13 <= -1.67721 )
								ret := 1.000000 // buy
							if( ema13 > -1.67721 )
								if( ema13 <= -0.586727 )
									ret := -0.261538
								if( ema13 > -0.586727 )
									ret := 0.004751
			if( d > 51.5979 )
				if( smoothD_d <= 51.3226 )
					if( k <= 50.8194 )
						if( tema <= 172.591 )
							if( smoothK_k <= 27.8994 )
								ret := 0.750000 // buy
							if( smoothK_k > 27.8994 )
								if( smoothK_k <= 34.8553 )
									ret := -0.222222
								if( smoothK_k > 34.8553 )
									ret := 0.421053
						if( tema > 172.591 )
							if( d_k <= 10.5384 )
								if( smoothK_k <= 44.9279 )
									ret := -0.666667
								if( smoothK_k > 44.9279 )
									ret := -0.857143 // sell
							if( d_k > 10.5384 )
								if( d_k <= 17.1651 )
									ret := 0.380952
								if( d_k > 17.1651 )
									ret := -0.272727
					if( k > 50.8194 )
						if( rsi1 <= 28.8057 )
							ret := 0.117647
						if( rsi1 > 28.8057 )
							if( k <= 72.0712 )
								if( tema <= 166.242 )
									ret := 1.000000 // buy
								if( tema > 166.242 )
									ret := 0.616766
							if( k > 72.0712 )
								if( tema <= 174.085 )
									ret := -0.096774
								if( tema > 174.085 )
									ret := 0.714286 // buy
				if( smoothD_d > 51.3226 )
					if( ema2 <= 176.11 )
						if( ema1 <= 169.222 )
							if( k <= 41.3468 )
								if( ema2 <= 167.077 )
									ret := 0.562500
								if( ema2 > 167.077 )
									ret := 0.910714 // buy
							if( k > 41.3468 )
								if( ema12 <= -0.029321 )
									ret := 0.375984
								if( ema12 > -0.029321 )
									ret := 0.116866
						if( ema1 > 169.222 )
							if( ema1 <= 169.976 )
								if( ema13 <= 0.201739 )
									ret := -0.064000
								if( ema13 > 0.201739 )
									ret := 0.789474 // buy
							if( ema1 > 169.976 )
								if( ema13 <= 0.17058 )
									ret := 0.085957
								if( ema13 > 0.17058 )
									ret := 0.362832
					if( ema2 > 176.11 )
						if( ema3 <= 176.338 )
							if( smoothD_d <= 72.4557 )
								if( ema3 <= 176.175 )
									ret := 0.100000
								if( ema3 > 176.175 )
									ret := 0.571429
							if( smoothD_d > 72.4557 )
								if( k <= 88.0213 )
									ret := 0.952381 // buy
								if( k > 88.0213 )
									ret := 0.333333
						if( ema3 > 176.338 )
							if( rsi1 <= 51.3586 )
								if( smoothD_d <= 65.1686 )
									ret := 0.222222
								if( smoothD_d > 65.1686 )
									ret := 1.000000 // buy
							if( rsi1 > 51.3586 )
								if( ema1 <= 176.372 )
									ret := -0.600000
								if( ema1 > 176.372 )
									ret := 0.000000
		if( ema3 > 176.461 )
			if( d_k <= -1.7397 )
				if( rsi1 <= 56.0824 )
					if( smoothD_d <= 30.9877 )
						if( d <= 8.48816 )
							if( ema1 <= 231.219 )
								if( ema12 <= -0.70576 )
									ret := 0.376000
								if( ema12 > -0.70576 )
									ret := -0.105006
							if( ema1 > 231.219 )
								if( rsi1 <= 44.8625 )
									ret := -0.948718 // sell
								if( rsi1 > 44.8625 )
									ret := -0.250000
						if( d > 8.48816 )
							if( k <= 16.6635 )
								if( ema13 <= -1.35777 )
									ret := -1.000000 // sell
								if( ema13 > -1.35777 )
									ret := 0.246217
							if( k > 16.6635 )
								if( ema1 <= 178.484 )
									ret := 0.169323
								if( ema1 > 178.484 )
									ret := -0.007354
					if( smoothD_d > 30.9877 )
						if( ema3 <= 196.273 )
							if( ema1 <= 194.637 )
								if( ema2 <= 183.326 )
									ret := -0.188114
								if( ema2 > 183.326 )
									ret := -0.062633
							if( ema1 > 194.637 )
								if( ema12 <= 0.015312 )
									ret := -0.491150
								if( ema12 > 0.015312 )
									ret := -0.205882
						if( ema3 > 196.273 )
							if( ema13 <= -0.642966 )
								if( smoothK_k <= 95.8111 )
									ret := 0.264286
								if( smoothK_k > 95.8111 )
									ret := -0.812500 // sell
							if( ema13 > -0.642966 )
								if( ema12 <= 0.035253 )
									ret := 0.006661
								if( ema12 > 0.035253 )
									ret := -0.195652
				if( rsi1 > 56.0824 )
					if( d_k <= -22.8591 )
						if( ema3 <= 221.229 )
							if( ema3 <= 212.866 )
								if( ema12 <= 0.023057 )
									ret := 0.029412
								if( ema12 > 0.023057 )
									ret := -0.566038
							if( ema3 > 212.866 )
								if( d <= 45.469 )
									ret := -0.800000 // sell
								if( d > 45.469 )
									ret := -1.000000 // sell
						if( ema3 > 221.229 )
							if( tema <= 226.111 )
								ret := 0.166667
							if( tema > 226.111 )
								ret := -0.181818
					if( d_k > -22.8591 )
						if( ema1 <= 230.373 )
							if( ema1 <= 213.976 )
								if( ema13 <= -0.033253 )
									ret := -0.380368
								if( ema13 > -0.033253 )
									ret := 0.129262
							if( ema1 > 213.976 )
								if( ema13 <= -0.03623 )
									ret := 0.655172
								if( ema13 > -0.03623 )
									ret := 0.207113
						if( ema1 > 230.373 )
							if( ema12 <= 0.05825 )
								if( tema <= 231.987 )
									ret := -0.250000
								if( tema > 231.987 )
									ret := 0.066667
							if( ema12 > 0.05825 )
								if( ema3 <= 231.153 )
									ret := -0.461538
								if( ema3 > 231.153 )
									ret := -1.000000 // sell
			if( d_k > -1.7397 )
				if( smoothK_k <= 62.7785 )
					if( tema <= 181.025 )
						if( tema <= 176.172 )
							if( smoothD_d <= -0.792149 )
								if( k <= 1.29894 )
									ret := -0.873016 // sell
								if( k > 1.29894 )
									ret := -0.470588
							if( smoothD_d > -0.792149 )
								if( ema12 <= -0.533662 )
									ret := 0.476190
								if( ema12 > -0.533662 )
									ret := -0.409091
						if( tema > 176.172 )
							if( d <= 66.9916 )
								if( k <= 62.4251 )
									ret := -0.124515
								if( k > 62.4251 )
									ret := 0.685714
							if( d > 66.9916 )
								if( rsi1 <= 50.9643 )
									ret := 0.338542
								if( rsi1 > 50.9643 )
									ret := -0.260870
					if( tema > 181.025 )
						if( smoothD_d <= 71.6231 )
							if( tema <= 223.937 )
								if( ema3 <= 220.845 )
									ret := 0.026336
								if( ema3 > 220.845 )
									ret := 0.289744
							if( tema > 223.937 )
								if( ema13 <= -1.26374 )
									ret := -0.638655
								if( ema13 > -1.26374 )
									ret := -0.008961
						if( smoothD_d > 71.6231 )
							if( d_k <= 26.7075 )
								if( ema13 <= -0.130263 )
									ret := -0.567164
								if( ema13 > -0.130263 )
									ret := -0.215000
							if( d_k > 26.7075 )
								ret := 0.636364
				if( smoothK_k > 62.7785 )
					if( ema12 <= -0.749431 )
						ret := -0.736842 // sell
					if( ema12 > -0.749431 )
						if( ema1 <= 177.974 )
							if( d_k <= -0.659977 )
								if( k <= 80.9559 )
									ret := 0.200000
								if( k > 80.9559 )
									ret := -0.411765
							if( d_k > -0.659977 )
								if( k <= 93.0595 )
									ret := 0.678112
								if( k > 93.0595 )
									ret := -0.411765
						if( ema1 > 177.974 )
							if( ema12 <= -0.257592 )
								if( tema <= 180.115 )
									ret := -0.800000 // sell
								if( tema > 180.115 )
									ret := 0.452830
							if( ema12 > -0.257592 )
								if( ema3 <= 226.939 )
									ret := 0.035578
								if( ema3 > 226.939 )
									ret := 0.404545
	if( rsi1 > 59.079 )
		if( smoothD_d <= 63.5661 )
			if( ema13 <= 0.317225 )
				if( ema1 <= 170.606 )
					if( d_k <= -22.2639 )
						if( ema2 <= 167.994 )
							ret := -0.500000
						if( ema2 > 167.994 )
							if( smoothK_k <= 67.061 )
								if( k <= 62.0753 )
									ret := 0.142857
								if( k > 62.0753 )
									ret := 0.769231 // buy
							if( smoothK_k > 67.061 )
								if( smoothK_k <= 79.665 )
									ret := -0.272727
								if( smoothK_k > 79.665 )
									ret := 0.400000
					if( d_k > -22.2639 )
						if( ema2 <= 169.785 )
							if( tema <= 169.872 )
								if( rsi1 <= 62.4232 )
									ret := -0.396396
								if( rsi1 > 62.4232 )
									ret := -0.028846
							if( tema > 169.872 )
								ret := -0.937500 // sell
						if( ema2 > 169.785 )
							if( smoothD_d <= 53.8156 )
								if( d_k <= -12.4111 )
									ret := -0.166667
								if( d_k > -12.4111 )
									ret := -0.802326 // sell
							if( smoothD_d > 53.8156 )
								if( ema1 <= 170.293 )
									ret := 0.000000
								if( ema1 > 170.293 )
									ret := -0.826087 // sell
				if( ema1 > 170.606 )
					if( tema <= 226.642 )
						if( d <= 28.0833 )
							if( d_k <= -18.4843 )
								if( rsi1 <= 71.1627 )
									ret := -0.607843
								if( rsi1 > 71.1627 )
									ret := 0.300000
							if( d_k > -18.4843 )
								if( d_k <= 14.8968 )
									ret := -0.038610
								if( d_k > 14.8968 )
									ret := -0.720000 // sell
						if( d > 28.0833 )
							if( smoothK_k <= 57.0765 )
								if( ema1 <= 223.402 )
									ret := 0.068566
								if( ema1 > 223.402 )
									ret := 0.468750
							if( smoothK_k > 57.0765 )
								if( rsi1 <= 66.531 )
									ret := -0.084685
								if( rsi1 > 66.531 )
									ret := 0.078464
					if( tema > 226.642 )
						if( rsi1 <= 75.4736 )
							if( tema <= 229.035 )
								if( smoothD_d <= 53.7522 )
									ret := -0.380952
								if( smoothD_d > 53.7522 )
									ret := -0.800000 // sell
							if( tema > 229.035 )
								if( ema2 <= 232.158 )
									ret := -0.030303
								if( ema2 > 232.158 )
									ret := -0.395349
						if( rsi1 > 75.4736 )
							ret := 0.400000
			if( ema13 > 0.317225 )
				if( ema1 <= 170.195 )
					if( k <= 46.0219 )
						if( rsi1 <= 66.6612 )
							if( ema3 <= 167.809 )
								if( ema3 <= 166.469 )
									ret := -0.307692
								if( ema3 > 166.469 )
									ret := -0.692308
							if( ema3 > 167.809 )
								if( ema2 <= 168.967 )
									ret := 1.000000 // buy
								if( ema2 > 168.967 )
									ret := -0.222222
						if( rsi1 > 66.6612 )
							if( smoothD_d <= 41.5252 )
								ret := -1.000000 // sell
							if( smoothD_d > 41.5252 )
								ret := -0.470588
					if( k > 46.0219 )
						if( rsi1 <= 62.7524 )
							if( ema13 <= 0.404108 )
								ret := -0.642857
							if( ema13 > 0.404108 )
								ret := 0.444444
						if( rsi1 > 62.7524 )
							if( ema2 <= 166.322 )
								ret := -0.133333
							if( ema2 > 166.322 )
								if( smoothD_d <= 44.5051 )
									ret := 0.250000
								if( smoothD_d > 44.5051 )
									ret := 0.777778 // buy
				if( ema1 > 170.195 )
					if( rsi1 <= 76.6268 )
						if( ema2 <= 232.156 )
							if( smoothK_k <= -2.71991 )
								if( ema3 <= 220.488 )
									ret := -0.096774
								if( ema3 > 220.488 )
									ret := 0.969697 // buy
							if( smoothK_k > -2.71991 )
								if( ema13 <= 0.70847 )
									ret := -0.253466
								if( ema13 > 0.70847 )
									ret := -0.567108
						if( ema2 > 232.156 )
							if( ema1 <= 234.371 )
								ret := 1.000000 // buy
							if( ema1 > 234.371 )
								ret := 0.214286
					if( rsi1 > 76.6268 )
						if( k <= 9.05559 )
							if( ema12 <= 0.690075 )
								ret := 0.200000
							if( ema12 > 0.690075 )
								ret := 1.000000 // buy
						if( k > 9.05559 )
							if( ema2 <= 172.143 )
								if( ema13 <= 0.405429 )
									ret := -1.000000 // sell
								if( ema13 > 0.405429 )
									ret := -0.888889 // sell
							if( ema2 > 172.143 )
								if( tema <= 230.43 )
									ret := 0.021459
								if( tema > 230.43 )
									ret := -0.764706 // sell
		if( smoothD_d > 63.5661 )
			if( ema13 <= 1.20843 )
				if( ema2 <= 193.654 )
					if( ema1 <= 179.118 )
						if( smoothK_k <= 93.5943 )
							if( tema <= 166.832 )
								if( ema12 <= 0.286641 )
									ret := 0.427046
								if( ema12 > 0.286641 )
									ret := -0.555556
							if( tema > 166.832 )
								if( tema <= 173.061 )
									ret := -0.076450
								if( tema > 173.061 )
									ret := 0.036014
						if( smoothK_k > 93.5943 )
							if( ema13 <= 0.654601 )
								if( ema13 <= 0.218313 )
									ret := -0.024664
								if( ema13 > 0.218313 )
									ret := -0.217722
							if( ema13 > 0.654601 )
								if( ema3 <= 169.745 )
									ret := -1.000000 // sell
								if( ema3 > 169.745 )
									ret := -0.432432
					if( ema1 > 179.118 )
						if( ema13 <= 0.807694 )
							if( ema3 <= 181.155 )
								if( tema <= 179.94 )
									ret := -0.003236
								if( tema > 179.94 )
									ret := 0.292717
							if( ema3 > 181.155 )
								if( ema2 <= 188.11 )
									ret := -0.028612
								if( ema2 > 188.11 )
									ret := 0.102021
						if( ema13 > 0.807694 )
							if( ema13 <= 1.02749 )
								if( ema3 <= 189.742 )
									ret := 0.540404
								if( ema3 > 189.742 )
									ret := -0.333333
							if( ema13 > 1.02749 )
								if( ema3 <= 189.659 )
									ret := -0.253968
								if( ema3 > 189.659 )
									ret := 0.578947
				if( ema2 > 193.654 )
					if( ema1 <= 215.083 )
						if( ema13 <= 0.199707 )
							if( tema <= 195.609 )
								if( smoothD_d <= 72.4863 )
									ret := 0.546667
								if( smoothD_d > 72.4863 )
									ret := 0.067093
							if( tema > 195.609 )
								if( smoothK_k <= 96.3691 )
									ret := -0.345972
								if( smoothK_k > 96.3691 )
									ret := 0.127660
						if( ema13 > 0.199707 )
							if( tema <= 208.202 )
								if( ema1 <= 194.001 )
									ret := 0.064516
								if( ema1 > 194.001 )
									ret := -0.485636
							if( tema > 208.202 )
								if( ema3 <= 208.791 )
									ret := 0.578431
								if( ema3 > 208.791 )
									ret := -0.279642
					if( ema1 > 215.083 )
						if( ema1 <= 226.804 )
							if( smoothD_d <= 92.3408 )
								if( rsi1 <= 76.4588 )
									ret := 0.090685
								if( rsi1 > 76.4588 )
									ret := -0.230769
							if( smoothD_d > 92.3408 )
								if( smoothK_k <= 91.2104 )
									ret := 0.743243 // buy
								if( smoothK_k > 91.2104 )
									ret := 0.153199
						if( ema1 > 226.804 )
							if( ema1 <= 231.465 )
								if( ema13 <= 0.881014 )
									ret := -0.178399
								if( ema13 > 0.881014 )
									ret := 0.430108
							if( ema1 > 231.465 )
								if( k <= 92.2434 )
									ret := -0.305263
								if( k > 92.2434 )
									ret := -0.561905
			if( ema13 > 1.20843 )
				if( rsi1 <= 85.9826 )
					if( d_k <= 4.65955 )
						if( ema12 <= 0.915889 )
							if( d_k <= 1.229 )
								if( smoothD_d <= 72.8346 )
									ret := -0.600000
								if( smoothD_d > 72.8346 )
									ret := 0.663043
							if( d_k > 1.229 )
								if( ema2 <= 207.79 )
									ret := -0.695652
								if( ema2 > 207.79 )
									ret := -0.098039
						if( ema12 > 0.915889 )
							if( ema12 <= 2.50129 )
								if( ema12 <= 1.60163 )
									ret := -0.512500
								if( ema12 > 1.60163 )
									ret := -1.000000 // sell
							if( ema12 > 2.50129 )
								ret := 0.181818
					if( d_k > 4.65955 )
						if( k <= 63.164 )
							ret := -0.608696
						if( k > 63.164 )
							if( ema1 <= 201.39 )
								if( smoothK_k <= 79.8103 )
									ret := -0.260870
								if( smoothK_k > 79.8103 )
									ret := 0.826087 // buy
							if( ema1 > 201.39 )
								if( rsi1 <= 77.2605 )
									ret := 0.932203 // buy
								if( rsi1 > 77.2605 )
									ret := -0.066667
				if( rsi1 > 85.9826 )
					if( d_k <= 0.372024 )
						if( d_k <= 0.000784 )
							if( ema3 <= 226.415 )
								if( smoothK_k <= 92.6558 )
									ret := 0.083333
								if( smoothK_k > 92.6558 )
									ret := 0.792208 // buy
							if( ema3 > 226.415 )
								ret := -0.900000 // sell
						if( d_k > 0.000784 )
							ret := -0.590909
					if( d_k > 0.372024 )
						if( rsi1 <= 89.1817 )
							if( smoothD_d <= 92.7724 )
								ret := 0.111111
							if( smoothD_d > 92.7724 )
								ret := 0.916667 // buy
						if( rsi1 > 89.1817 )
							if( smoothD_d <= 95.9195 )
								ret := 1.000000 // buy
							if( smoothD_d > 95.9195 )
								ret := 0.714286 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_AAPL_5Min_8c2a7b77(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


