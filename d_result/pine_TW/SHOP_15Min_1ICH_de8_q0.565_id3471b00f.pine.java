//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SHOP_15Min_1ICH_3471b00f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_15Min_1ICH_3471b00f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_15Min_3471b00f(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 33.2137 )
		if( senkou_span_b_displaced <= 30.2838 )
			if( senkou_span_b <= 28.3053 )
				if( kinjun_sen <= 27.5388 )
					if( basis_minus <= -0.003927 )
						if( kinjun_sen <= 25.896 )
							if( chinkou_span <= 26.261 )
								if( senkou_span_a_displaced <= 26.3672 )
									ret := 0.900000 // buy
								if( senkou_span_a_displaced > 26.3672 )
									ret := 1.000000 // buy
							if( chinkou_span > 26.261 )
								ret := 0.555556
						if( kinjun_sen > 25.896 )
							if( chinkou_span <= 26.4428 )
								if( kinjun_sen <= 26.3371 )
									ret := -0.045455
								if( kinjun_sen > 26.3371 )
									ret := -0.409836
							if( chinkou_span > 26.4428 )
								if( tenkan_sen <= 27.0249 )
									ret := 0.693333
								if( tenkan_sen > 27.0249 )
									ret := -0.121951
					if( basis_minus > -0.003927 )
						if( kinjun_sen <= 27.1593 )
							if( chinkou_span <= 26.0872 )
								if( tenkan_sen <= 26.0063 )
									ret := 0.223881
								if( tenkan_sen > 26.0063 )
									ret := -0.833333 // sell
							if( chinkou_span > 26.0872 )
								if( senkou_span_a <= 26.2188 )
									ret := 0.032967
								if( senkou_span_a > 26.2188 )
									ret := 0.769231 // buy
						if( kinjun_sen > 27.1593 )
							if( basis_max <= -0.053606 )
								if( senkou_span_b <= 27.0647 )
									ret := 0.050000
								if( senkou_span_b > 27.0647 )
									ret := -0.733333 // sell
							if( basis_max > -0.053606 )
								if( chinkou_span <= 27.1766 )
									ret := -0.958333 // sell
								if( chinkou_span > 27.1766 )
									ret := -0.857143 // sell
				if( kinjun_sen > 27.5388 )
					if( chinkou_span <= 27.3992 )
						if( chinkou_span <= 26.8032 )
							ret := -0.545455
						if( chinkou_span > 26.8032 )
							if( basis_minus <= -0.574305 )
								ret := -0.923077 // sell
							if( basis_minus > -0.574305 )
								ret := -0.818182 // sell
					if( chinkou_span > 27.3992 )
						if( kinjun_sen <= 28.1525 )
							if( kinjun_sen <= 27.7086 )
								if( senkou_span_a <= 27.6805 )
									ret := 0.872340 // buy
								if( senkou_span_a > 27.6805 )
									ret := 0.200000
							if( kinjun_sen > 27.7086 )
								if( senkou_span_b_displaced <= 28.12 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 28.12 )
									ret := 0.727273 // buy
						if( kinjun_sen > 28.1525 )
							if( tenkan_sen <= 28.6225 )
								if( senkou_span_b_displaced <= 28.6888 )
									ret := 0.756098 // buy
								if( senkou_span_b_displaced > 28.6888 )
									ret := 0.000000
							if( tenkan_sen > 28.6225 )
								if( senkou_span_b_displaced <= 28.0825 )
									ret := 0.464286
								if( senkou_span_b_displaced > 28.0825 )
									ret := -0.739130 // sell
			if( senkou_span_b > 28.3053 )
				if( senkou_span_b_displaced <= 28.3898 )
					if( basis_minus <= 0.410422 )
						if( basis_max <= 0.198352 )
							if( chinkou_span <= 29.125 )
								if( basis_max <= 0.028794 )
									ret := -0.958621 // sell
								if( basis_max > 0.028794 )
									ret := -0.833333 // sell
							if( chinkou_span > 29.125 )
								ret := -0.444444
						if( basis_max > 0.198352 )
							if( tenkan_sen <= 28.6175 )
								ret := -0.529412
							if( tenkan_sen > 28.6175 )
								ret := 0.550000
					if( basis_minus > 0.410422 )
						if( senkou_span_a_displaced <= 28.0643 )
							ret := 1.000000 // buy
						if( senkou_span_a_displaced > 28.0643 )
							if( senkou_span_a <= 30.7631 )
								if( senkou_span_a <= 29.7378 )
									ret := -0.285714
								if( senkou_span_a > 29.7378 )
									ret := -0.703704 // sell
							if( senkou_span_a > 30.7631 )
								ret := 0.000000
				if( senkou_span_b_displaced > 28.3898 )
					if( basis_max <= 0.204119 )
						if( basis_max <= -0.270842 )
							if( senkou_span_b <= 29.7952 )
								ret := -1.000000 // sell
							if( senkou_span_b > 29.7952 )
								ret := -0.357143
						if( basis_max > -0.270842 )
							if( chinkou_span <= 28.5016 )
								if( kinjun_sen <= 28.6431 )
									ret := 0.008000
								if( kinjun_sen > 28.6431 )
									ret := -0.729412 // sell
							if( chinkou_span > 28.5016 )
								if( basis_max <= -0.018948 )
									ret := 0.025424
								if( basis_max > -0.018948 )
									ret := 0.333333
					if( basis_max > 0.204119 )
						if( tenkan_sen <= 28.0931 )
							if( senkou_span_b_displaced <= 28.8375 )
								ret := -0.312500
							if( senkou_span_b_displaced > 28.8375 )
								ret := 0.000000
						if( tenkan_sen > 28.0931 )
							if( basis_minus <= -0.294862 )
								if( senkou_span_a_displaced <= 29.7206 )
									ret := 0.090909
								if( senkou_span_a_displaced > 29.7206 )
									ret := -0.666667
							if( basis_minus > -0.294862 )
								if( kinjun_sen <= 29.2947 )
									ret := -1.000000 // sell
								if( kinjun_sen > 29.2947 )
									ret := -0.727273 // sell
		if( senkou_span_b_displaced > 30.2838 )
			if( tenkan_sen <= 32.4376 )
				if( senkou_span_b_displaced <= 33.5972 )
					if( basis_max <= 0.351517 )
						if( basis_minus <= 0.004585 )
							if( kinjun_sen <= 29.837 )
								if( basis_max <= 0.015719 )
									ret := -1.000000 // sell
								if( basis_max > 0.015719 )
									ret := -0.562500
							if( kinjun_sen > 29.837 )
								if( chinkou_span <= 31.1117 )
									ret := -0.437299
								if( chinkou_span > 31.1117 )
									ret := -0.009058
						if( basis_minus > 0.004585 )
							if( senkou_span_a_displaced <= 31.0327 )
								if( basis_minus <= 0.43715 )
									ret := -0.042105
								if( basis_minus > 0.43715 )
									ret := -0.700000 // sell
							if( senkou_span_a_displaced > 31.0327 )
								if( kinjun_sen <= 31.9271 )
									ret := 0.727273 // buy
								if( kinjun_sen > 31.9271 )
									ret := -0.244444
					if( basis_max > 0.351517 )
						if( chinkou_span <= 28.095 )
							ret := -0.800000 // sell
						if( chinkou_span > 28.095 )
							if( chinkou_span <= 30.984 )
								if( senkou_span_a <= 30.8379 )
									ret := 0.950000 // buy
								if( senkou_span_a > 30.8379 )
									ret := -0.266667
							if( chinkou_span > 30.984 )
								if( basis_minus <= -0.432807 )
									ret := 0.976744 // buy
								if( basis_minus > -0.432807 )
									ret := 0.888889 // buy
				if( senkou_span_b_displaced > 33.5972 )
					if( senkou_span_a_displaced <= 33.8679 )
						if( senkou_span_b_displaced <= 34.012 )
							if( basis_max <= -0.0075 )
								if( senkou_span_b_displaced <= 33.7808 )
									ret := 0.642857
								if( senkou_span_b_displaced > 33.7808 )
									ret := -0.222222
							if( basis_max > -0.0075 )
								if( senkou_span_a <= 32.228 )
									ret := 0.928571 // buy
								if( senkou_span_a > 32.228 )
									ret := 0.363636
						if( senkou_span_b_displaced > 34.012 )
							if( senkou_span_b_displaced <= 34.32 )
								ret := 0.000000
							if( senkou_span_b_displaced > 34.32 )
								ret := 0.250000
					if( senkou_span_a_displaced > 33.8679 )
						if( basis_minus <= -0.5399 )
							if( senkou_span_a <= 32.0125 )
								if( senkou_span_a_displaced <= 35.0184 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 35.0184 )
									ret := 0.636364
							if( senkou_span_a > 32.0125 )
								if( basis_max <= 0.54125 )
									ret := 0.666667
								if( basis_max > 0.54125 )
									ret := -0.272727
						if( basis_minus > -0.5399 )
							ret := -0.285714
			if( tenkan_sen > 32.4376 )
				if( basis_max <= -0.045439 )
					if( tenkan_sen <= 32.6621 )
						if( basis_max <= -0.125433 )
							ret := -0.631579
						if( basis_max > -0.125433 )
							if( senkou_span_b <= 32.3859 )
								if( basis_minus <= 0.304521 )
									ret := -0.428571
								if( basis_minus > 0.304521 )
									ret := -1.000000 // sell
							if( senkou_span_b > 32.3859 )
								ret := -1.000000 // sell
					if( tenkan_sen > 32.6621 )
						if( senkou_span_a <= 32.6081 )
							if( chinkou_span <= 31.0525 )
								ret := 0.090909
							if( chinkou_span > 31.0525 )
								ret := -0.375000
						if( senkou_span_a > 32.6081 )
							if( kinjun_sen <= 32.863 )
								if( chinkou_span <= 31.4706 )
									ret := -0.466667
								if( chinkou_span > 31.4706 )
									ret := -0.908257 // sell
							if( kinjun_sen > 32.863 )
								if( senkou_span_b <= 33.2875 )
									ret := -0.265306
								if( senkou_span_b > 33.2875 )
									ret := -0.670588
				if( basis_max > -0.045439 )
					if( senkou_span_a_displaced <= 31.9921 )
						if( chinkou_span <= 32.5226 )
							ret := 1.000000 // buy
						if( chinkou_span > 32.5226 )
							ret := 0.818182 // buy
					if( senkou_span_a_displaced > 31.9921 )
						if( tenkan_sen <= 33.8005 )
							if( kinjun_sen <= 33.8925 )
								if( chinkou_span <= 31.8675 )
									ret := -0.827160 // sell
								if( chinkou_span > 31.8675 )
									ret := -0.138365
							if( kinjun_sen > 33.8925 )
								if( senkou_span_b <= 34.1728 )
									ret := 0.576271
								if( senkou_span_b > 34.1728 )
									ret := -0.090909
						if( tenkan_sen > 33.8005 )
							if( basis_max <= 0.164527 )
								if( chinkou_span <= 32.5077 )
									ret := -0.940000 // sell
								if( chinkou_span > 32.5077 )
									ret := -0.625954
							if( basis_max > 0.164527 )
								if( basis_minus <= -0.689766 )
									ret := -0.590909
								if( basis_minus > -0.689766 )
									ret := -0.085714
	if( chinkou_span > 33.2137 )
		if( senkou_span_b <= 33.7191 )
			if( chinkou_span <= 33.9601 )
				if( senkou_span_b <= 32.605 )
					if( tenkan_sen <= 33.18 )
						if( senkou_span_a_displaced <= 29.7009 )
							if( kinjun_sen <= 29.2654 )
								ret := 0.538462
							if( kinjun_sen > 29.2654 )
								ret := -0.307692
						if( senkou_span_a_displaced > 29.7009 )
							if( basis_max <= -0.289244 )
								ret := 0.600000
							if( basis_max > -0.289244 )
								if( basis_max <= -0.010118 )
									ret := -0.931034 // sell
								if( basis_max > -0.010118 )
									ret := -0.173913
					if( tenkan_sen > 33.18 )
						if( senkou_span_a <= 32.645 )
							ret := 0.941176 // buy
						if( senkou_span_a > 32.645 )
							if( tenkan_sen <= 33.4053 )
								if( senkou_span_a <= 33.4284 )
									ret := 0.315789
								if( senkou_span_a > 33.4284 )
									ret := 1.000000 // buy
							if( tenkan_sen > 33.4053 )
								if( kinjun_sen <= 33.5225 )
									ret := -0.489362
								if( kinjun_sen > 33.5225 )
									ret := -0.153846
				if( senkou_span_b > 32.605 )
					if( senkou_span_a <= 33.2916 )
						if( senkou_span_b <= 32.6347 )
							if( senkou_span_a_displaced <= 32.7963 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 32.7963 )
								ret := 0.750000 // buy
						if( senkou_span_b > 32.6347 )
							if( kinjun_sen <= 32.8298 )
								if( chinkou_span <= 33.45 )
									ret := 0.000000
								if( chinkou_span > 33.45 )
									ret := 0.400000
							if( kinjun_sen > 32.8298 )
								if( senkou_span_b <= 33.3587 )
									ret := 0.744681 // buy
								if( senkou_span_b > 33.3587 )
									ret := 0.217391
					if( senkou_span_a > 33.2916 )
						if( kinjun_sen <= 33.5396 )
							if( basis_minus <= 0.168661 )
								ret := -0.846154 // sell
							if( basis_minus > 0.168661 )
								if( kinjun_sen <= 33.3675 )
									ret := -0.250000
								if( kinjun_sen > 33.3675 )
									ret := -0.857143 // sell
						if( kinjun_sen > 33.5396 )
							if( basis_max <= -0.041512 )
								if( kinjun_sen <= 33.76 )
									ret := -0.125000
								if( kinjun_sen > 33.76 )
									ret := -0.615385
							if( basis_max > -0.041512 )
								if( chinkou_span <= 33.775 )
									ret := 0.647059
								if( chinkou_span > 33.775 )
									ret := 0.857143 // buy
			if( chinkou_span > 33.9601 )
				if( kinjun_sen <= 33.5264 )
					if( senkou_span_a <= 29.8489 )
						if( senkou_span_b <= 29.7154 )
							ret := 0.363636
						if( senkou_span_b > 29.7154 )
							ret := -1.000000 // sell
					if( senkou_span_a > 29.8489 )
						if( senkou_span_b <= 33.5267 )
							if( basis_minus <= -0.698993 )
								ret := 0.272727
							if( basis_minus > -0.698993 )
								if( basis_minus <= 0.223125 )
									ret := 0.891738 // buy
								if( basis_minus > 0.223125 )
									ret := 0.664921
						if( senkou_span_b > 33.5267 )
							ret := 0.153846
				if( kinjun_sen > 33.5264 )
					if( basis_minus <= 0.65125 )
						if( kinjun_sen <= 33.7095 )
							if( senkou_span_b_displaced <= 33.5175 )
								if( chinkou_span <= 34.2187 )
									ret := -0.727273 // sell
								if( chinkou_span > 34.2187 )
									ret := -0.047619
							if( senkou_span_b_displaced > 33.5175 )
								ret := -0.900000 // sell
						if( kinjun_sen > 33.7095 )
							if( tenkan_sen <= 34.1787 )
								if( basis_minus <= 0.2138 )
									ret := 0.848485 // buy
								if( basis_minus > 0.2138 )
									ret := 0.000000
							if( tenkan_sen > 34.1787 )
								if( basis_max <= -0.33292 )
									ret := 0.900000 // buy
								if( basis_max > -0.33292 )
									ret := 1.000000 // buy
					if( basis_minus > 0.65125 )
						if( basis_max <= -0.583522 )
							ret := 0.500000
						if( basis_max > -0.583522 )
							if( senkou_span_a_displaced <= 32.8327 )
								if( basis_max <= -0.200886 )
									ret := -0.500000
								if( basis_max > -0.200886 )
									ret := -0.750000 // sell
							if( senkou_span_a_displaced > 32.8327 )
								if( tenkan_sen <= 34.7125 )
									ret := 0.071429
								if( tenkan_sen > 34.7125 )
									ret := -0.888889 // sell
		if( senkou_span_b > 33.7191 )
			if( senkou_span_b_displaced <= 1023.07 )
				if( basis_minus <= 0.594657 )
					if( senkou_span_b <= 958.124 )
						if( basis_max <= -1.09013 )
							if( basis_minus <= -1.84651 )
								if( basis_max <= -5.09524 )
									ret := 0.333333
								if( basis_max > -5.09524 )
									ret := -0.417984
							if( basis_minus > -1.84651 )
								if( senkou_span_b_displaced <= 542.914 )
									ret := 0.052239
								if( senkou_span_b_displaced > 542.914 )
									ret := -0.379310
						if( basis_max > -1.09013 )
							if( senkou_span_b_displaced <= 1019.53 )
								if( senkou_span_a_displaced <= 964.21 )
									ret := -0.002135
								if( senkou_span_a_displaced > 964.21 )
									ret := -0.666667
							if( senkou_span_b_displaced > 1019.53 )
								ret := 1.000000 // buy
					if( senkou_span_b > 958.124 )
						if( senkou_span_a <= 1026.05 )
							if( chinkou_span <= 990.773 )
								if( senkou_span_b <= 991.313 )
									ret := 0.295276
								if( senkou_span_b > 991.313 )
									ret := -0.494253
							if( chinkou_span > 990.773 )
								if( senkou_span_a_displaced <= 1019.77 )
									ret := 0.703927 // buy
								if( senkou_span_a_displaced > 1019.77 )
									ret := 0.141593
						if( senkou_span_a > 1026.05 )
							if( chinkou_span <= 1031.22 )
								ret := -0.947368 // sell
							if( chinkou_span > 1031.22 )
								ret := -0.222222
				if( basis_minus > 0.594657 )
					if( tenkan_sen <= 1081.27 )
						if( senkou_span_b <= 35.8148 )
							if( senkou_span_b_displaced <= 34.71 )
								if( basis_minus <= 1.73654 )
									ret := -0.151515
								if( basis_minus > 1.73654 )
									ret := 0.454545
							if( senkou_span_b_displaced > 34.71 )
								if( chinkou_span <= 36.36 )
									ret := -0.533333
								if( chinkou_span > 36.36 )
									ret := -1.000000 // sell
						if( senkou_span_b > 35.8148 )
							if( basis_minus <= 40.4593 )
								if( tenkan_sen <= 1061.2 )
									ret := 0.050425
								if( tenkan_sen > 1061.2 )
									ret := 0.786885 // buy
							if( basis_minus > 40.4593 )
								if( senkou_span_b_displaced <= 894.605 )
									ret := -0.272727
								if( senkou_span_b_displaced > 894.605 )
									ret := -1.000000 // sell
					if( tenkan_sen > 1081.27 )
						if( senkou_span_b_displaced <= 1003.71 )
							if( basis_max <= -15.4506 )
								ret := -0.800000 // sell
							if( basis_max > -15.4506 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 1003.71 )
							if( chinkou_span <= 1072.16 )
								ret := -0.923077 // sell
							if( chinkou_span > 1072.16 )
								ret := -0.230769
			if( senkou_span_b_displaced > 1023.07 )
				if( kinjun_sen <= 1014.29 )
					if( senkou_span_b <= 964.599 )
						if( tenkan_sen <= 950.556 )
							if( basis_max <= 11.9371 )
								if( senkou_span_b_displaced <= 1034.7 )
									ret := -0.909091 // sell
								if( senkou_span_b_displaced > 1034.7 )
									ret := -0.777778 // sell
							if( basis_max > 11.9371 )
								ret := -0.166667
						if( tenkan_sen > 950.556 )
							if( senkou_span_b <= 957.84 )
								ret := 0.818182 // buy
							if( senkou_span_b > 957.84 )
								ret := 1.000000 // buy
					if( senkou_span_b > 964.599 )
						if( chinkou_span <= 1014.59 )
							if( senkou_span_a_displaced <= 1047.62 )
								if( senkou_span_a <= 970.81 )
									ret := -0.933333 // sell
								if( senkou_span_a > 970.81 )
									ret := -0.593525
							if( senkou_span_a_displaced > 1047.62 )
								if( basis_max <= 6.32684 )
									ret := -1.000000 // sell
								if( basis_max > 6.32684 )
									ret := 0.529412
						if( chinkou_span > 1014.59 )
							if( senkou_span_a <= 999.461 )
								ret := -0.375000
							if( senkou_span_a > 999.461 )
								if( senkou_span_a <= 1006.49 )
									ret := 0.551724
								if( senkou_span_a > 1006.49 )
									ret := -0.200000
				if( kinjun_sen > 1014.29 )
					if( senkou_span_b <= 1698.68 )
						if( basis_minus <= 28.8225 )
							if( senkou_span_a <= 1644.19 )
								if( senkou_span_a <= 1569.94 )
									ret := -0.035032
								if( senkou_span_a > 1569.94 )
									ret := -0.489552
							if( senkou_span_a > 1644.19 )
								if( senkou_span_b_displaced <= 1642.65 )
									ret := -0.481481
								if( senkou_span_b_displaced > 1642.65 )
									ret := 0.542714
						if( basis_minus > 28.8225 )
							if( senkou_span_b_displaced <= 1581.38 )
								if( chinkou_span <= 1100.48 )
									ret := -0.738095 // sell
								if( chinkou_span > 1100.48 )
									ret := 0.237349
							if( senkou_span_b_displaced > 1581.38 )
								if( chinkou_span <= 1576.53 )
									ret := -0.600000
								if( chinkou_span > 1576.53 )
									ret := -0.833333 // sell
					if( senkou_span_b > 1698.68 )
						if( tenkan_sen <= 1705.14 )
							if( basis_minus <= -12.5694 )
								ret := -1.000000 // sell
							if( basis_minus > -12.5694 )
								ret := 0.764706 // buy
						if( tenkan_sen > 1705.14 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ichimoku_Cloud 
//@version=5
//indicator "Ichimoku Cloud", overlay=true)

// Input parameters for the Ichimoku Cloud
turning_periods = input.int(9, title="Tenkan-Sen Period")
standard_periods = input.int(26, title="Kinjun-Sen Period")
leading_span2_periods = input.int(52, title="Senkou Span B Period")
displacement = input.int(26, title="Displacement")

show_tenkan_sen = input.bool(true, title="Show Tenkan-Sen")
show_kinjun_sen = input.bool(true, title="Show Kinjun-Sen")
show_chinkou_span = input.bool(true, title="Show Chinkou Span")
show_cloud = input.bool(true, title="Show Cloud")
show_crosses = input.bool(false, title="Show Crosses")

// Donchian channel calculation
donchian(highs, lows, length) =>
    (ta.highest(highs, length) + ta.lowest(lows, length)) / 2

// Ichimoku calculations
tenkan_sen = donchian(high, low, turning_periods)
kinjun_sen = donchian(high, low, standard_periods)
senkou_span_a = (tenkan_sen + kinjun_sen) / 2
senkou_span_b = donchian(high, low, leading_span2_periods)

// Displaced Senkou Spans
senkou_span_a_displaced = senkou_span_a[displacement]
senkou_span_b_displaced = senkou_span_b[displacement]

// Chinkou Span
chinkou_span = close[displacement]

// Crosses
cross_up_tenkan_kinjun = ta.crossover(tenkan_sen, kinjun_sen)
cross_dn_tenkan_kinjun = ta.crossunder(tenkan_sen, kinjun_sen)
cross_up_tenkan_kinjunInt = cross_up_tenkan_kinjun ? 1 : 0  // Bool to int
cross_dn_tenkan_kinjunInt = cross_dn_tenkan_kinjun ? 1 : 0  // Bool to int

basis_minus = senkou_span_a - senkou_span_b
basis_max = senkou_span_a - tenkan_sen

// Plotting
plot(show_tenkan_sen ? tenkan_sen : na, color=color.lime, title="Tenkan-Sen", linewidth=1)
plot(show_kinjun_sen ? kinjun_sen : na, color=color.fuchsia, title="Kinjun-Sen", linewidth=1)
plot(show_chinkou_span ? chinkou_span : na, color=color.aqua, title="Chinkou Span", linewidth=1, offset=-displacement)

// Plot the Senkou Span lines and store the plot references
senkou_span_a_plot = plot(show_cloud ? senkou_span_a_displaced : na, color=color.green, title="Senkou Span A", linewidth=1)
senkou_span_b_plot = plot(show_cloud ? senkou_span_b_displaced : na, color=color.red, title="Senkou Span B", linewidth=1)

// Cloud filling
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.lime, 90), title="Bullish Cloud", transp=70, fillgaps=true)
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.red, 90), title="Bearish Cloud", transp=70, fillgaps=true)

plotshape(series=(show_crosses and cross_up_tenkan_kinjun) ? close : na, location=location.belowbar, color=color.yellow, style=shape.triangleup, size=size.small, title="Cross Up Tenkan Kinjun")
plotshape(series=(show_crosses and cross_dn_tenkan_kinjun) ? close : na, location=location.abovebar, color=color.yellow, style=shape.triangledown, size=size.small, title="Cross Down Tenkan Kinjun")

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
float op_operation = decision_tree_0_SHOP_15Min_3471b00f(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


