//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: TSLA_30Min_2SV0_f3bf3ca4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_2SV0_f3bf3ca4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_f3bf3ca4(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d <= 60.4749 )
		if( VIP <= 0.928072 )
			if( VIM <= 1.22792 )
				if( d_k <= -14.7823 )
					if( rsi1 <= 29.5388 )
						if( k <= 73.7166 )
							if( k <= 71.2489 )
								if( rsi1 <= 26.9559 )
									ret := 0.111111
								if( rsi1 > 26.9559 )
									ret := -0.419355
							if( k > 71.2489 )
								ret := 1.000000 // buy
						if( k > 73.7166 )
							ret := -1.000000 // sell
					if( rsi1 > 29.5388 )
						if( d_k <= -21.2583 )
							if( d_k <= -26.4309 )
								if( d_k <= -28.8385 )
									ret := 0.142857
								if( d_k > -28.8385 )
									ret := -0.638889
							if( d_k > -26.4309 )
								if( rsi1 <= 37.6018 )
									ret := 0.397059
								if( rsi1 > 37.6018 )
									ret := -0.098214
						if( d_k > -21.2583 )
							if( smoothD_d <= 10.4031 )
								if( d_k <= -16.937 )
									ret := 0.000000
								if( d_k > -16.937 )
									ret := -0.666667
							if( smoothD_d > 10.4031 )
								if( VIP_VIM <= -0.342852 )
									ret := 0.095238
								if( VIP_VIM > -0.342852 )
									ret := 0.469231
				if( d_k > -14.7823 )
					if( d_k <= 6.58802 )
						if( smoothK_k <= 66.7431 )
							if( VIP <= 0.562827 )
								if( VIM <= 1.16979 )
									ret := 1.000000 // buy
								if( VIM > 1.16979 )
									ret := 0.666667
							if( VIP > 0.562827 )
								if( rsi1 <= 32.542 )
									ret := -0.093991
								if( rsi1 > 32.542 )
									ret := -0.012607
						if( smoothK_k > 66.7431 )
							if( d_k <= -14.2239 )
								ret := 1.000000 // buy
							if( d_k > -14.2239 )
								if( rsi1 <= 44.8146 )
									ret := 0.058824
								if( rsi1 > 44.8146 )
									ret := 0.909091 // buy
					if( d_k > 6.58802 )
						if( d_k <= 25.4284 )
							if( k <= 12.1749 )
								if( VIP <= 0.864461 )
									ret := 0.253353
								if( VIP > 0.864461 )
									ret := 0.004914
							if( k > 12.1749 )
								if( k <= 20.5112 )
									ret := -0.199557
								if( k > 20.5112 )
									ret := 0.111562
						if( d_k > 25.4284 )
							if( k <= 18.3939 )
								if( rsi1 <= 36.9291 )
									ret := -0.303371
								if( rsi1 > 36.9291 )
									ret := 0.724138 // buy
							if( k > 18.3939 )
								if( VIP <= 0.790271 )
									ret := -0.033333
								if( VIP > 0.790271 )
									ret := -0.600000
			if( VIM > 1.22792 )
				if( smoothD_d <= -2.0226 )
					if( rsi1 <= 6.60771 )
						if( d <= 0.000778 )
							if( VIM <= 1.36282 )
								ret := 0.000000
							if( VIM > 1.36282 )
								if( VIP_VIM <= -0.882873 )
									ret := 0.000000
								if( VIP_VIM > -0.882873 )
									ret := 0.428571
						if( d > 0.000778 )
							if( d <= 0.698352 )
								if( rsi1 <= 1.95477 )
									ret := 1.000000 // buy
								if( rsi1 > 1.95477 )
									ret := 0.649123
							if( d > 0.698352 )
								if( VIP <= 0.661931 )
									ret := 0.333333
								if( VIP > 0.661931 )
									ret := -0.200000
					if( rsi1 > 6.60771 )
						if( rsi1 <= 8.03086 )
							if( k <= 0.321101 )
								if( rsi1 <= 7.83309 )
									ret := -0.600000
								if( rsi1 > 7.83309 )
									ret := -1.000000 // sell
							if( k > 0.321101 )
								ret := 0.333333
						if( rsi1 > 8.03086 )
							if( k <= 0.008274 )
								if( VIP_VIM <= -0.606102 )
									ret := 0.400000
								if( VIP_VIM > -0.606102 )
									ret := 0.191781
							if( k > 0.008274 )
								if( d <= 0.596837 )
									ret := -0.081633
								if( d > 0.596837 )
									ret := 0.218009
				if( smoothD_d > -2.0226 )
					if( d_k <= 8.74377 )
						if( rsi1 <= 32.7575 )
							if( d <= 57.6136 )
								if( VIM <= 1.47842 )
									ret := 0.003829
								if( VIM > 1.47842 )
									ret := 0.182796
							if( d > 57.6136 )
								if( VIP_VIM <= -0.610548 )
									ret := -0.500000
								if( VIP_VIM > -0.610548 )
									ret := 0.650000
						if( rsi1 > 32.7575 )
							if( VIM <= 1.36603 )
								if( VIP <= 0.805769 )
									ret := 0.404762
								if( VIP > 0.805769 )
									ret := 0.177738
							if( VIM > 1.36603 )
								if( VIP <= 0.797925 )
									ret := 0.240000
								if( VIP > 0.797925 )
									ret := -0.292035
					if( d_k > 8.74377 )
						if( smoothK_k <= 10.1446 )
							if( rsi1 <= 22.0264 )
								if( VIP_VIM <= -0.887216 )
									ret := -0.750000 // sell
								if( VIP_VIM > -0.887216 )
									ret := -0.057508
							if( rsi1 > 22.0264 )
								if( d <= 11.9843 )
									ret := 0.631579
								if( d > 11.9843 )
									ret := 0.150685
						if( smoothK_k > 10.1446 )
							if( d <= 54.9127 )
								if( VIP <= 0.706171 )
									ret := 0.604167
								if( VIP > 0.706171 )
									ret := 0.250000
							if( d > 54.9127 )
								if( smoothD_d <= 55.1009 )
									ret := -0.340426
								if( smoothD_d > 55.1009 )
									ret := 0.264151
		if( VIP > 0.928072 )
			if( VIM <= 0.794936 )
				if( d <= 3.46308 )
					if( d <= 0.542193 )
						ret := 1.000000 // buy
					if( d > 0.542193 )
						if( k <= 1.29294 )
							ret := 0.000000
						if( k > 1.29294 )
							if( rsi1 <= 74.2495 )
								ret := 0.200000
							if( rsi1 > 74.2495 )
								if( VIP <= 1.37086 )
									ret := -1.000000 // sell
								if( VIP > 1.37086 )
									ret := -0.500000
				if( d > 3.46308 )
					if( rsi1 <= 79.8759 )
						if( smoothD_d <= 7.21154 )
							if( rsi1 <= 73.9502 )
								if( VIM <= 0.777444 )
									ret := 0.580645
								if( VIM > 0.777444 )
									ret := 0.916667 // buy
							if( rsi1 > 73.9502 )
								if( VIM <= 0.739474 )
									ret := 0.333333
								if( VIM > 0.739474 )
									ret := -0.600000
						if( smoothD_d > 7.21154 )
							if( d <= 38.6792 )
								if( d_k <= -15.2069 )
									ret := -0.251799
								if( d_k > -15.2069 )
									ret := 0.127572
							if( d > 38.6792 )
								if( d <= 58.8754 )
									ret := 0.258156
								if( d > 58.8754 )
									ret := -0.161765
					if( rsi1 > 79.8759 )
						if( k <= 67.1731 )
							if( VIP <= 1.49324 )
								if( smoothK_k <= 24.3919 )
									ret := 0.731481 // buy
								if( smoothK_k > 24.3919 )
									ret := 0.377432
							if( VIP > 1.49324 )
								if( d_k <= 21.1023 )
									ret := -0.076923
								if( d_k > 21.1023 )
									ret := -1.000000 // sell
						if( k > 67.1731 )
							if( d_k <= -30.6044 )
								if( VIP <= 1.29011 )
									ret := 0.000000
								if( VIP > 1.29011 )
									ret := 0.888889 // buy
							if( d_k > -30.6044 )
								if( k <= 82.7598 )
									ret := -0.319444
								if( k > 82.7598 )
									ret := 0.555556
			if( VIM > 0.794936 )
				if( smoothD_d <= 13.4957 )
					if( rsi1 <= 21.9568 )
						if( VIP <= 10.8972 )
							if( VIP <= 1.02525 )
								if( VIM <= 1.34026 )
									ret := -0.173913
								if( VIM > 1.34026 )
									ret := 0.236842
							if( VIP > 1.02525 )
								if( k <= 12.8868 )
									ret := -0.469136
								if( k > 12.8868 )
									ret := 0.666667
						if( VIP > 10.8972 )
							if( VIM <= 21.6406 )
								if( d_k <= 0.665611 )
									ret := 0.925926 // buy
								if( d_k > 0.665611 )
									ret := 0.000000
							if( VIM > 21.6406 )
								ret := -1.000000 // sell
					if( rsi1 > 21.9568 )
						if( d_k <= 10.0397 )
							if( VIM <= 0.798528 )
								if( smoothK_k <= 2.51652 )
									ret := -1.000000 // sell
								if( smoothK_k > 2.51652 )
									ret := -0.200000
							if( VIM > 0.798528 )
								if( VIM <= 1.07863 )
									ret := 0.107861
								if( VIM > 1.07863 )
									ret := 0.189491
						if( d_k > 10.0397 )
							if( k <= 0.025762 )
								if( VIM <= 1.1776 )
									ret := 0.010989
								if( VIM > 1.1776 )
									ret := 0.545455
							if( k > 0.025762 )
								if( smoothK_k <= -2.49197 )
									ret := 0.800000 // buy
								if( smoothK_k > -2.49197 )
									ret := 0.443878
				if( smoothD_d > 13.4957 )
					if( VIP <= 1.50996 )
						if( d <= 24.2393 )
							if( k <= 43.588 )
								if( k <= 37.4386 )
									ret := 0.024883
								if( k > 37.4386 )
									ret := 0.321267
							if( k > 43.588 )
								if( rsi1 <= 67.3916 )
									ret := -0.524590
								if( rsi1 > 67.3916 )
									ret := 0.235294
						if( d > 24.2393 )
							if( smoothD_d <= 27.7368 )
								if( smoothK_k <= 43.113 )
									ret := 0.158496
								if( smoothK_k > 43.113 )
									ret := 0.380074
							if( smoothD_d > 27.7368 )
								if( rsi1 <= 33.4363 )
									ret := -0.134078
								if( rsi1 > 33.4363 )
									ret := 0.092492
					if( VIP > 1.50996 )
						if( d_k <= 5.66018 )
							if( k <= 14.2654 )
								ret := 1.000000 // buy
							if( k > 14.2654 )
								if( rsi1 <= 62.1093 )
									ret := -0.114943
								if( rsi1 > 62.1093 )
									ret := 0.222222
						if( d_k > 5.66018 )
							if( VIM <= 0.829129 )
								ret := 0.500000
							if( VIM > 0.829129 )
								if( smoothK_k <= 4.95754 )
									ret := -0.888889 // sell
								if( smoothK_k > 4.95754 )
									ret := -0.402597
	if( d > 60.4749 )
		if( rsi1 <= 76.8053 )
			if( k <= 97.9746 )
				if( VIM <= 1.04479 )
					if( rsi1 <= 41.2019 )
						if( d <= 63.5502 )
							if( VIP <= 0.869281 )
								if( rsi1 <= 35.588 )
									ret := -1.000000 // sell
								if( rsi1 > 35.588 )
									ret := -0.750000 // sell
							if( VIP > 0.869281 )
								if( d <= 62.2686 )
									ret := 0.571429
								if( d > 62.2686 )
									ret := -0.333333
						if( d > 63.5502 )
							if( VIP_VIM <= -0.168163 )
								if( d <= 78.4759 )
									ret := 0.689189
								if( d > 78.4759 )
									ret := 0.166667
							if( VIP_VIM > -0.168163 )
								if( d <= 72.7021 )
									ret := 0.546875
								if( d > 72.7021 )
									ret := 0.080247
					if( rsi1 > 41.2019 )
						if( d <= 98.8111 )
							if( VIP_VIM <= 0.311371 )
								if( rsi1 <= 75.4061 )
									ret := 0.001911
								if( rsi1 > 75.4061 )
									ret := -0.577778
							if( VIP_VIM > 0.311371 )
								if( VIM <= 0.989408 )
									ret := 0.068857
								if( VIM > 0.989408 )
									ret := -0.212500
						if( d > 98.8111 )
							if( VIP <= 1.36139 )
								if( d <= 98.8952 )
									ret := -0.692308
								if( d > 98.8952 )
									ret := -0.133333
							if( VIP > 1.36139 )
								if( VIM <= 0.882132 )
									ret := -0.750000 // sell
								if( VIM > 0.882132 )
									ret := -1.000000 // sell
				if( VIM > 1.04479 )
					if( d_k <= -16.9996 )
						if( d <= 61.8221 )
							if( VIP_VIM <= 0.176898 )
								if( rsi1 <= 45.6987 )
									ret := -0.187500
								if( rsi1 > 45.6987 )
									ret := -0.647059
							if( VIP_VIM > 0.176898 )
								ret := 0.750000 // buy
						if( d > 61.8221 )
							if( rsi1 <= 25.0625 )
								if( VIP_VIM <= -0.566385 )
									ret := -0.200000
								if( VIP_VIM > -0.566385 )
									ret := -0.857143 // sell
							if( rsi1 > 25.0625 )
								if( d <= 68.9057 )
									ret := 0.119266
								if( d > 68.9057 )
									ret := 0.359788
					if( d_k > -16.9996 )
						if( VIP <= 0.845009 )
							if( VIM <= 1.19778 )
								if( d_k <= 14.7303 )
									ret := -0.363014
								if( d_k > 14.7303 )
									ret := 0.137255
							if( VIM > 1.19778 )
								if( smoothD_d <= 72.2495 )
									ret := -0.184971
								if( smoothD_d > 72.2495 )
									ret := 0.170040
						if( VIP > 0.845009 )
							if( VIP <= 0.919493 )
								if( d <= 66.8739 )
									ret := -0.153153
								if( d > 66.8739 )
									ret := 0.144764
							if( VIP > 0.919493 )
								if( smoothD_d <= 90.8935 )
									ret := -0.039620
								if( smoothD_d > 90.8935 )
									ret := -0.217949
			if( k > 97.9746 )
				if( VIP_VIM <= -0.089288 )
					if( smoothD_d <= 85.0008 )
						if( rsi1 <= 43.2586 )
							if( smoothD_d <= 81.2905 )
								if( VIP <= 0.857181 )
									ret := -0.500000
								if( VIP > 0.857181 )
									ret := 0.192308
							if( smoothD_d > 81.2905 )
								if( rsi1 <= 31.5682 )
									ret := 0.857143 // buy
								if( rsi1 > 31.5682 )
									ret := 0.230769
						if( rsi1 > 43.2586 )
							if( VIM <= 1.04308 )
								ret := -0.833333 // sell
							if( VIM > 1.04308 )
								if( rsi1 <= 44.5952 )
									ret := -0.800000 // sell
								if( rsi1 > 44.5952 )
									ret := -0.125000
					if( smoothD_d > 85.0008 )
						if( rsi1 <= 49.2143 )
							if( VIP <= 1.02177 )
								if( VIP <= 0.939575 )
									ret := -0.327434
								if( VIP > 0.939575 )
									ret := -0.685393
							if( VIP > 1.02177 )
								if( smoothK_k <= 96.2003 )
									ret := 0.750000 // buy
								if( smoothK_k > 96.2003 )
									ret := 0.000000
						if( rsi1 > 49.2143 )
							if( VIP <= 1.07556 )
								if( rsi1 <= 51.2431 )
									ret := -0.153846
								if( rsi1 > 51.2431 )
									ret := 0.619048
							if( VIP > 1.07556 )
								if( smoothK_k <= 95.5684 )
									ret := -0.666667
								if( smoothK_k > 95.5684 )
									ret := -0.166667
				if( VIP_VIM > -0.089288 )
					if( VIP_VIM <= 0.007897 )
						if( VIP <= 0.929788 )
							if( VIM <= 0.984967 )
								ret := -0.166667
							if( VIM > 0.984967 )
								if( VIM <= 0.99612 )
									ret := -1.000000 // sell
								if( VIM > 0.99612 )
									ret := -0.750000 // sell
						if( VIP > 0.929788 )
							if( d <= 99.4541 )
								if( smoothD_d <= 81.9065 )
									ret := -0.094340
								if( smoothD_d > 81.9065 )
									ret := 0.338798
							if( d > 99.4541 )
								if( VIP <= 0.978835 )
									ret := 0.000000
								if( VIP > 0.978835 )
									ret := -0.666667
					if( VIP_VIM > 0.007897 )
						if( VIP <= 1.29608 )
							if( VIP <= 1.07181 )
								if( smoothD_d <= 96.3727 )
									ret := -0.180258
								if( smoothD_d > 96.3727 )
									ret := -0.577778
							if( VIP > 1.07181 )
								if( d_k <= 0.029916 )
									ret := -0.030432
								if( d_k > 0.029916 )
									ret := -0.201754
						if( VIP > 1.29608 )
							if( VIP <= 1.64195 )
								if( rsi1 <= 50.3288 )
									ret := 0.909091 // buy
								if( rsi1 > 50.3288 )
									ret := -0.254902
							if( VIP > 1.64195 )
								if( smoothD_d <= 93.7002 )
									ret := -0.400000
								if( smoothD_d > 93.7002 )
									ret := -0.823529 // sell
		if( rsi1 > 76.8053 )
			if( VIP_VIM <= 0.864314 )
				if( k <= 63.0387 )
					if( d_k <= 17.9174 )
						if( smoothK_k <= 59.6292 )
							if( VIP <= 1.34928 )
								if( rsi1 <= 77.3696 )
									ret := 0.850000 // buy
								if( rsi1 > 77.3696 )
									ret := 0.126761
							if( VIP > 1.34928 )
								if( VIM <= 0.672456 )
									ret := -0.571429
								if( VIM > 0.672456 )
									ret := 0.161290
						if( smoothK_k > 59.6292 )
							if( VIP <= 1.3447 )
								ret := 1.000000 // buy
							if( VIP > 1.3447 )
								ret := 0.500000
					if( d_k > 17.9174 )
						if( VIP <= 1.369 )
							if( VIP_VIM <= 0.532264 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.532264 )
								if( smoothK_k <= 44.1508 )
									ret := 0.333333
								if( smoothK_k > 44.1508 )
									ret := 0.857143 // buy
						if( VIP > 1.369 )
							if( VIP_VIM <= 0.800081 )
								if( d_k <= 23.0945 )
									ret := -0.300000
								if( d_k > 23.0945 )
									ret := 0.750000 // buy
							if( VIP_VIM > 0.800081 )
								ret := 1.000000 // buy
				if( k > 63.0387 )
					if( d_k <= 2.32851 )
						if( d <= 97.1538 )
							if( d_k <= 1.76324 )
								if( d_k <= -15.718 )
									ret := 0.264085
								if( d_k > -15.718 )
									ret := 0.060285
							if( d_k > 1.76324 )
								if( d <= 86.2621 )
									ret := 0.128205
								if( d > 86.2621 )
									ret := -0.468750
						if( d > 97.1538 )
							if( VIM <= 1.23818 )
								if( smoothK_k <= 96.9997 )
									ret := 0.219348
								if( smoothK_k > 96.9997 )
									ret := 0.016706
							if( VIM > 1.23818 )
								if( smoothD_d <= 96.9032 )
									ret := 0.756098 // buy
								if( smoothD_d > 96.9032 )
									ret := 0.000000
					if( d_k > 2.32851 )
						if( rsi1 <= 81.6222 )
							if( k <= 93.8713 )
								if( smoothD_d <= 91.5523 )
									ret := 0.130137
								if( smoothD_d > 91.5523 )
									ret := -0.247788
							if( k > 93.8713 )
								if( rsi1 <= 77.7986 )
									ret := -0.400000
								if( rsi1 > 77.7986 )
									ret := 0.529412
						if( rsi1 > 81.6222 )
							if( VIP <= 1.40848 )
								if( smoothD_d <= 87.2474 )
									ret := 0.278146
								if( smoothD_d > 87.2474 )
									ret := 0.536398
							if( VIP > 1.40848 )
								if( d <= 88.6403 )
									ret := -0.476190
								if( d > 88.6403 )
									ret := 0.330275
			if( VIP_VIM > 0.864314 )
				if( rsi1 <= 96.9807 )
					if( smoothK_k <= 96.5 )
						if( VIP_VIM <= 1.17059 )
							if( VIP_VIM <= 1.08361 )
								if( smoothK_k <= 93.153 )
									ret := -0.060729
								if( smoothK_k > 93.153 )
									ret := -0.242775
							if( VIP_VIM > 1.08361 )
								if( VIM <= 0.48842 )
									ret := -0.133333
								if( VIM > 0.48842 )
									ret := 0.500000
						if( VIP_VIM > 1.17059 )
							if( smoothK_k <= 94.1327 )
								if( d_k <= -0.258187 )
									ret := -0.500000
								if( d_k > -0.258187 )
									ret := 0.000000
							if( smoothK_k > 94.1327 )
								if( smoothK_k <= 95.4482 )
									ret := -1.000000 // sell
								if( smoothK_k > 95.4482 )
									ret := -0.500000
					if( smoothK_k > 96.5 )
						if( d <= 79.31 )
							if( VIP <= 1.48678 )
								ret := -0.500000
							if( VIP > 1.48678 )
								ret := -1.000000 // sell
						if( d > 79.31 )
							if( k <= 99.9752 )
								if( VIP <= 1.57995 )
									ret := 0.410959
								if( VIP > 1.57995 )
									ret := -0.333333
							if( k > 99.9752 )
								if( rsi1 <= 81.4335 )
									ret := 0.857143 // buy
								if( rsi1 > 81.4335 )
									ret := -0.031579
				if( rsi1 > 96.9807 )
					if( k <= 99.9998 )
						if( VIP_VIM <= 0.970964 )
							ret := 0.250000
						if( VIP_VIM > 0.970964 )
							if( smoothD_d <= 96.8302 )
								ret := 1.000000 // buy
							if( smoothD_d > 96.8302 )
								ret := 0.750000 // buy
					if( k > 99.9998 )
						if( rsi1 <= 97.965 )
							ret := -0.750000 // sell
						if( rsi1 > 97.965 )
							ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_TSLA_30Min_f3bf3ca4(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)

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


