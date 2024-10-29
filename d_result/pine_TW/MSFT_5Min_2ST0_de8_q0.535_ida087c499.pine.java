//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MSFT_5Min_2ST0_a087c499 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2ST0_a087c499", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_a087c499(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.169096 )
		if( ema2 <= 443.578 )
			if( rsi1 <= 35.2905 )
				if( ema2 <= 322.975 )
					if( d <= 2.24221 )
						if( ema13 <= -0.085929 )
							if( d_k <= -0.058286 )
								if( smoothD_d <= -1.56111 )
									ret := 0.050000
								if( smoothD_d > -1.56111 )
									ret := 0.600000
							if( d_k > -0.058286 )
								if( ema3 <= 307.134 )
									ret := 0.133333
								if( ema3 > 307.134 )
									ret := 0.781513 // buy
						if( ema13 > -0.085929 )
							if( ema12 <= -0.088628 )
								ret := -1.000000 // sell
							if( ema12 > -0.088628 )
								ret := 0.166667
					if( d > 2.24221 )
						if( ema12 <= -0.231207 )
							if( ema3 <= 278.705 )
								if( ema13 <= -0.574168 )
									ret := 1.000000 // buy
								if( ema13 > -0.574168 )
									ret := 0.500000
							if( ema3 > 278.705 )
								if( d_k <= -10.0393 )
									ret := -0.121212
								if( d_k > -10.0393 )
									ret := 0.305276
						if( ema12 > -0.231207 )
							if( ema1 <= 321.076 )
								if( k <= 85.6062 )
									ret := 0.102804
								if( k > 85.6062 )
									ret := -1.000000 // sell
							if( ema1 > 321.076 )
								if( ema1 <= 321.241 )
									ret := -0.916667 // sell
								if( ema1 > 321.241 )
									ret := -0.094340
				if( ema2 > 322.975 )
					if( ema1 <= 325.263 )
						if( ema3 <= 325.766 )
							if( ema13 <= -0.280422 )
								if( ema13 <= -0.785103 )
									ret := -0.282051
								if( ema13 > -0.785103 )
									ret := 0.084507
							if( ema13 > -0.280422 )
								if( smoothK_k <= 1.98523 )
									ret := -0.966667 // sell
								if( smoothK_k > 1.98523 )
									ret := 0.117647
						if( ema3 > 325.766 )
							if( k <= 3.75673 )
								if( ema1 <= 324.829 )
									ret := -0.250000
								if( ema1 > 324.829 )
									ret := 0.400000
							if( k > 3.75673 )
								if( d_k <= -11.6653 )
									ret := 0.000000
								if( d_k > -11.6653 )
									ret := -0.812500 // sell
					if( ema1 > 325.263 )
						if( tema <= 328.117 )
							if( rsi1 <= 19.8671 )
								if( d <= 19.0563 )
									ret := 0.771429 // buy
								if( d > 19.0563 )
									ret := -0.409091
							if( rsi1 > 19.8671 )
								if( tema <= 326.473 )
									ret := -0.027211
								if( tema > 326.473 )
									ret := 0.321799
						if( tema > 328.117 )
							if( tema <= 342.159 )
								if( tema <= 335.398 )
									ret := 0.029486
								if( tema > 335.398 )
									ret := -0.200000
							if( tema > 342.159 )
								if( smoothK_k <= 8.34201 )
									ret := 0.079907
								if( smoothK_k > 8.34201 )
									ret := 0.152115
			if( rsi1 > 35.2905 )
				if( d_k <= 10.7106 )
					if( ema2 <= 306.359 )
						if( ema2 <= 287.377 )
							if( rsi1 <= 55.1415 )
								if( ema12 <= -0.249153 )
									ret := 0.625000
								if( ema12 > -0.249153 )
									ret := -0.541667
							if( rsi1 > 55.1415 )
								if( smoothD_d <= 68.086 )
									ret := 0.510638
								if( smoothD_d > 68.086 )
									ret := -0.333333
						if( ema2 > 287.377 )
							if( tema <= 306.124 )
								if( smoothD_d <= 5.57275 )
									ret := -0.234375
								if( smoothD_d > 5.57275 )
									ret := 0.319058
							if( tema > 306.124 )
								if( ema1 <= 306.265 )
									ret := 0.968750 // buy
								if( ema1 > 306.265 )
									ret := 0.681818
					if( ema2 > 306.359 )
						if( ema3 <= 356.949 )
							if( tema <= 338.721 )
								if( ema13 <= -0.672482 )
									ret := -0.257282
								if( ema13 > -0.672482 )
									ret := 0.043369
							if( tema > 338.721 )
								if( d_k <= -9.56476 )
									ret := 0.082547
								if( d_k > -9.56476 )
									ret := -0.193367
						if( ema3 > 356.949 )
							if( ema3 <= 407.013 )
								if( ema1 <= 359.602 )
									ret := 0.737705 // buy
								if( ema1 > 359.602 )
									ret := 0.103209
							if( ema3 > 407.013 )
								if( ema2 <= 407.315 )
									ret := -0.282258
								if( ema2 > 407.315 )
									ret := 0.021421
				if( d_k > 10.7106 )
					if( ema12 <= 0.014408 )
						if( ema2 <= 432.306 )
							if( ema2 <= 431.449 )
								if( rsi1 <= 51.7348 )
									ret := 0.162197
								if( rsi1 > 51.7348 )
									ret := -0.036496
							if( ema2 > 431.449 )
								if( tema <= 431.762 )
									ret := -0.785714 // sell
								if( tema > 431.762 )
									ret := 0.000000
						if( ema2 > 432.306 )
							if( ema13 <= -0.145192 )
								if( ema12 <= -0.186163 )
									ret := 0.333333
								if( ema12 > -0.186163 )
									ret := -0.176471
							if( ema13 > -0.145192 )
								if( k <= 46.8729 )
									ret := 0.803571 // buy
								if( k > 46.8729 )
									ret := 0.000000
					if( ema12 > 0.014408 )
						if( ema2 <= 424.865 )
							if( ema1 <= 420.368 )
								if( ema2 <= 416.935 )
									ret := 0.072186
								if( ema2 > 416.935 )
									ret := -0.393617
							if( ema1 > 420.368 )
								if( smoothK_k <= 66.1081 )
									ret := 0.246269
								if( smoothK_k > 66.1081 )
									ret := 0.757576 // buy
						if( ema2 > 424.865 )
							if( k <= 72.286 )
								if( tema <= 433.597 )
									ret := -0.331250
								if( tema > 433.597 )
									ret := 0.000000
							if( k > 72.286 )
								if( k <= 74.2934 )
									ret := 1.000000 // buy
								if( k > 74.2934 )
									ret := 0.000000
		if( ema2 > 443.578 )
			if( tema <= 448.256 )
				if( rsi1 <= 58.5717 )
					if( ema2 <= 443.854 )
						if( k <= 24.6117 )
							if( rsi1 <= 39.7165 )
								if( ema3 <= 443.765 )
									ret := 1.000000 // buy
								if( ema3 > 443.765 )
									ret := 0.571429
							if( rsi1 > 39.7165 )
								if( ema3 <= 443.553 )
									ret := 0.250000
								if( ema3 > 443.553 )
									ret := -0.500000
						if( k > 24.6117 )
							if( rsi1 <= 52.1095 )
								if( rsi1 <= 48.8689 )
									ret := 1.000000 // buy
								if( rsi1 > 48.8689 )
									ret := 0.833333 // buy
							if( rsi1 > 52.1095 )
								ret := 0.500000
					if( ema2 > 443.854 )
						if( ema3 <= 443.867 )
							if( ema3 <= 443.782 )
								ret := 0.000000
							if( ema3 > 443.782 )
								ret := -1.000000 // sell
						if( ema3 > 443.867 )
							if( d <= 23.2386 )
								if( ema13 <= -0.563369 )
									ret := 0.221053
								if( ema13 > -0.563369 )
									ret := 0.609524
							if( d > 23.2386 )
								if( ema12 <= 0.104139 )
									ret := 0.200000
								if( ema12 > 0.104139 )
									ret := 0.720930 // buy
				if( rsi1 > 58.5717 )
					if( ema12 <= 0.15194 )
						if( ema13 <= -0.137522 )
							ret := 0.500000
						if( ema13 > -0.137522 )
							if( k <= 55.424 )
								ret := 0.142857
							if( k > 55.424 )
								if( tema <= 444.514 )
									ret := 0.000000
								if( tema > 444.514 )
									ret := -0.545455
					if( ema12 > 0.15194 )
						ret := 0.500000
			if( tema > 448.256 )
				if( ema12 <= -0.984226 )
					if( rsi1 <= 9.32101 )
						ret := 0.666667
					if( rsi1 > 9.32101 )
						if( smoothK_k <= 88.3725 )
							if( ema2 <= 452.652 )
								ret := -0.500000
							if( ema2 > 452.652 )
								ret := -1.000000 // sell
						if( smoothK_k > 88.3725 )
							ret := 0.000000
				if( ema12 > -0.984226 )
					if( rsi1 <= 43.197 )
						if( d_k <= -2.05572 )
							if( tema <= 460.922 )
								if( ema12 <= -0.048073 )
									ret := 0.229814
								if( ema12 > -0.048073 )
									ret := -0.416667
							if( tema > 460.922 )
								if( ema13 <= -0.305176 )
									ret := -0.724138 // sell
								if( ema13 > -0.305176 )
									ret := -0.047619
						if( d_k > -2.05572 )
							if( ema1 <= 453.004 )
								if( ema12 <= -0.16589 )
									ret := 0.321429
								if( ema12 > -0.16589 )
									ret := -0.060976
							if( ema1 > 453.004 )
								if( ema13 <= -0.229224 )
									ret := 0.486056
								if( ema13 > -0.229224 )
									ret := 0.160000
					if( rsi1 > 43.197 )
						if( ema2 <= 460.302 )
							if( k <= 51.6345 )
								if( d <= 14.5478 )
									ret := 0.210526
								if( d > 14.5478 )
									ret := -0.194030
							if( k > 51.6345 )
								if( tema <= 452.393 )
									ret := -0.080745
								if( tema > 452.393 )
									ret := 0.221014
						if( ema2 > 460.302 )
							if( tema <= 465.012 )
								if( tema <= 463.2 )
									ret := 0.241935
								if( tema > 463.2 )
									ret := 0.825000 // buy
							if( tema > 465.012 )
								if( ema13 <= 0.00418 )
									ret := -0.132075
								if( ema13 > 0.00418 )
									ret := 0.210526
	if( ema12 > 0.169096 )
		if( k <= 98.9214 )
			if( k <= 66.5508 )
				if( d <= 46.392 )
					if( tema <= 399.243 )
						if( tema <= 357.414 )
							if( ema1 <= 338.8 )
								if( k <= 5.32851 )
									ret := 0.435897
								if( k > 5.32851 )
									ret := 0.003145
							if( ema1 > 338.8 )
								if( smoothD_d <= 12.7586 )
									ret := -0.041096
								if( smoothD_d > 12.7586 )
									ret := -0.517073
						if( tema > 357.414 )
							if( tema <= 369.204 )
								if( ema12 <= 0.4588 )
									ret := 0.770642 // buy
								if( ema12 > 0.4588 )
									ret := 0.282051
							if( tema > 369.204 )
								if( ema3 <= 384.184 )
									ret := 0.027356
								if( ema3 > 384.184 )
									ret := 0.420213
					if( tema > 399.243 )
						if( smoothD_d <= 27.3389 )
							if( k <= 42.9523 )
								if( ema13 <= 1.99369 )
									ret := -0.148189
								if( ema13 > 1.99369 )
									ret := -0.814815 // sell
							if( k > 42.9523 )
								if( ema12 <= 0.307935 )
									ret := -0.342857
								if( ema12 > 0.307935 )
									ret := -0.864865 // sell
						if( smoothD_d > 27.3389 )
							if( d <= 40.5178 )
								if( rsi1 <= 81.3983 )
									ret := -0.001748
								if( rsi1 > 81.3983 )
									ret := -0.625000
							if( d > 40.5178 )
								if( ema1 <= 399.826 )
									ret := -0.777778 // sell
								if( ema1 > 399.826 )
									ret := 0.230994
				if( d > 46.392 )
					if( ema1 <= 327.566 )
						if( ema13 <= 1.05239 )
							if( ema3 <= 317.155 )
								if( d <= 67.2187 )
									ret := -0.183908
								if( d > 67.2187 )
									ret := 0.433962
							if( ema3 > 317.155 )
								if( tema <= 320.975 )
									ret := -0.613636
								if( tema > 320.975 )
									ret := -0.210191
						if( ema13 > 1.05239 )
							if( rsi1 <= 61.4399 )
								ret := 0.571429
							if( rsi1 > 61.4399 )
								if( rsi1 <= 75.4062 )
									ret := -0.909091 // sell
								if( rsi1 > 75.4062 )
									ret := -0.272727
					if( ema1 > 327.566 )
						if( ema13 <= 2.08477 )
							if( d <= 66.2309 )
								if( ema3 <= 329.211 )
									ret := 0.265823
								if( ema3 > 329.211 )
									ret := -0.140689
							if( d > 66.2309 )
								if( ema13 <= 0.753571 )
									ret := -0.078652
								if( ema13 > 0.753571 )
									ret := 0.154472
						if( ema13 > 2.08477 )
							if( k <= 47.966 )
								if( ema12 <= 1.1789 )
									ret := 0.200000
								if( ema12 > 1.1789 )
									ret := -0.888889 // sell
							if( k > 47.966 )
								if( d_k <= 19.039 )
									ret := 0.787234 // buy
								if( d_k > 19.039 )
									ret := -0.500000
			if( k > 66.5508 )
				if( ema13 <= 1.34145 )
					if( ema3 <= 331.248 )
						if( d <= 80.6234 )
							if( ema13 <= 0.826739 )
								if( tema <= 319.895 )
									ret := 0.158371
								if( tema > 319.895 )
									ret := 0.411079
							if( ema13 > 0.826739 )
								if( d_k <= 0.29613 )
									ret := 0.120000
								if( d_k > 0.29613 )
									ret := -0.520833
						if( d > 80.6234 )
							if( ema1 <= 329.955 )
								if( ema13 <= 0.456806 )
									ret := 0.146552
								if( ema13 > 0.456806 )
									ret := -0.083149
							if( ema1 > 329.955 )
								if( d <= 96.2071 )
									ret := 0.171779
								if( d > 96.2071 )
									ret := 0.653846
					if( ema3 > 331.248 )
						if( ema3 <= 332.29 )
							if( d <= 65.8863 )
								if( d <= 54.1532 )
									ret := -0.250000
								if( d > 54.1532 )
									ret := 0.555556
							if( d > 65.8863 )
								if( tema <= 333.194 )
									ret := -0.327103
								if( tema > 333.194 )
									ret := -0.777778 // sell
						if( ema3 > 332.29 )
							if( d_k <= 13.9903 )
								if( smoothK_k <= 95.9204 )
									ret := -0.011361
								if( smoothK_k > 95.9204 )
									ret := 1.000000 // buy
							if( d_k > 13.9903 )
								if( ema3 <= 416.177 )
									ret := 0.073171
								if( ema3 > 416.177 )
									ret := 0.700000 // buy
				if( ema13 > 1.34145 )
					if( smoothD_d <= 68.5948 )
						if( ema12 <= 1.43753 )
							if( smoothK_k <= 77.4887 )
								if( ema2 <= 320.834 )
									ret := 0.500000
								if( ema2 > 320.834 )
									ret := -0.453125
							if( smoothK_k > 77.4887 )
								if( ema13 <= 1.47029 )
									ret := 0.800000 // buy
								if( ema13 > 1.47029 )
									ret := 0.250000
						if( ema12 > 1.43753 )
							if( ema2 <= 372.08 )
								ret := -1.000000 // sell
							if( ema2 > 372.08 )
								ret := -0.500000
					if( smoothD_d > 68.5948 )
						if( rsi1 <= 62.8376 )
							if( smoothK_k <= 86.1919 )
								if( ema1 <= 409.016 )
									ret := -0.400000
								if( ema1 > 409.016 )
									ret := 0.833333 // buy
							if( smoothK_k > 86.1919 )
								if( ema3 <= 439.964 )
									ret := -1.000000 // sell
								if( ema3 > 439.964 )
									ret := -0.750000 // sell
						if( rsi1 > 62.8376 )
							if( ema1 <= 331.978 )
								if( smoothK_k <= 76.1696 )
									ret := 0.063830
								if( smoothK_k > 76.1696 )
									ret := 0.624277
							if( ema1 > 331.978 )
								if( smoothD_d <= 74.9346 )
									ret := 0.576471
								if( smoothD_d > 74.9346 )
									ret := 0.147287
		if( k > 98.9214 )
			if( ema2 <= 323.625 )
				if( ema13 <= 0.947712 )
					if( d <= 87.6001 )
						if( ema12 <= 0.394082 )
							if( ema13 <= 0.253356 )
								if( k <= 99.8869 )
									ret := 0.500000
								if( k > 99.8869 )
									ret := -0.500000
							if( ema13 > 0.253356 )
								if( rsi1 <= 70.8369 )
									ret := 0.500000
								if( rsi1 > 70.8369 )
									ret := 1.000000 // buy
						if( ema12 > 0.394082 )
							ret := -0.400000
					if( d > 87.6001 )
						if( tema <= 322.713 )
							if( ema1 <= 321.274 )
								if( rsi1 <= 61.4448 )
									ret := 0.666667
								if( rsi1 > 61.4448 )
									ret := -0.303571
							if( ema1 > 321.274 )
								if( rsi1 <= 64.2205 )
									ret := 0.000000
								if( rsi1 > 64.2205 )
									ret := 1.000000 // buy
						if( tema > 322.713 )
							if( d <= 92.6639 )
								if( rsi1 <= 79.8873 )
									ret := -1.000000 // sell
								if( rsi1 > 79.8873 )
									ret := -0.500000
							if( d > 92.6639 )
								if( rsi1 <= 71.9971 )
									ret := -0.769231 // sell
								if( rsi1 > 71.9971 )
									ret := 0.200000
				if( ema13 > 0.947712 )
					if( smoothD_d <= 96.4811 )
						if( d <= 91.896 )
							ret := -0.250000
						if( d > 91.896 )
							if( rsi1 <= 80.197 )
								if( ema3 <= 319.557 )
									ret := -0.500000
								if( ema3 > 319.557 )
									ret := -1.000000 // sell
							if( rsi1 > 80.197 )
								ret := -1.000000 // sell
					if( smoothD_d > 96.4811 )
						ret := -0.333333
			if( ema2 > 323.625 )
				if( ema1 <= 334.184 )
					if( rsi1 <= 62.9347 )
						if( ema1 <= 328.473 )
							ret := 0.500000
						if( ema1 > 328.473 )
							if( tema <= 332.726 )
								ret := 1.000000 // buy
							if( tema > 332.726 )
								ret := 0.750000 // buy
					if( rsi1 > 62.9347 )
						if( d <= 99.6678 )
							if( rsi1 <= 92.3832 )
								if( ema13 <= 0.297209 )
									ret := -0.318182
								if( ema13 > 0.297209 )
									ret := 0.341463
							if( rsi1 > 92.3832 )
								if( k <= 99.1319 )
									ret := -1.000000 // sell
								if( k > 99.1319 )
									ret := -0.400000
						if( d > 99.6678 )
							if( smoothK_k <= 96.6713 )
								ret := 0.666667
							if( smoothK_k > 96.6713 )
								if( d <= 99.7401 )
									ret := -1.000000 // sell
								if( d > 99.7401 )
									ret := -0.390244
				if( ema1 > 334.184 )
					if( ema1 <= 351.267 )
						if( ema3 <= 343.472 )
							if( ema1 <= 336.043 )
								if( tema <= 335.756 )
									ret := 0.181818
								if( tema > 335.756 )
									ret := -0.666667
							if( ema1 > 336.043 )
								if( ema3 <= 336.5 )
									ret := 0.437500
								if( ema3 > 336.5 )
									ret := -0.128205
						if( ema3 > 343.472 )
							if( smoothD_d <= 95.6843 )
								if( rsi1 <= 82.7858 )
									ret := 0.266667
								if( rsi1 > 82.7858 )
									ret := -0.833333 // sell
							if( smoothD_d > 95.6843 )
								if( smoothD_d <= 96.2626 )
									ret := -0.750000 // sell
								if( smoothD_d > 96.2626 )
									ret := -0.968750 // sell
					if( ema1 > 351.267 )
						if( ema3 <= 445.73 )
							if( ema12 <= 1.1386 )
								if( ema13 <= 1.52571 )
									ret := -0.053309
								if( ema13 > 1.52571 )
									ret := 0.452830
							if( ema12 > 1.1386 )
								if( tema <= 420.048 )
									ret := -0.162162
								if( tema > 420.048 )
									ret := -0.909091 // sell
						if( ema3 > 445.73 )
							if( ema12 <= 0.456 )
								if( ema2 <= 458.123 )
									ret := 0.107143
								if( ema2 > 458.123 )
									ret := -0.500000
							if( ema12 > 0.456 )
								if( ema2 <= 456.99 )
									ret := -0.815789 // sell
								if( ema2 > 456.99 )
									ret := -0.250000
	
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
float op_operation = decision_tree_0_MSFT_5Min_a087c499(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


