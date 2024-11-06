//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: NIO_5Min_2SV0_5439582e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_2SV0_5439582e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_5439582e(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 49.749 )
		if( d <= 47.8385 )
			if( d_k <= -6.1698 )
				if( rsi1 <= 16.6226 )
					if( d <= 24.3244 )
						if( smoothD_d <= 18.9382 )
							if( smoothK_k <= 9.12423 )
								if( rsi1 <= 14.4799 )
									ret := -0.750000 // sell
								if( rsi1 > 14.4799 )
									ret := -1.000000 // sell
							if( smoothK_k > 9.12423 )
								if( d_k <= -6.75364 )
									ret := -0.400000
								if( d_k > -6.75364 )
									ret := -0.888889 // sell
						if( smoothD_d > 18.9382 )
							ret := 1.000000 // buy
					if( d > 24.3244 )
						if( smoothD_d <= 26.436 )
							ret := -0.714286 // sell
						if( smoothD_d > 26.436 )
							ret := -1.000000 // sell
				if( rsi1 > 16.6226 )
					if( d <= 44.1771 )
						if( VIP <= 0.75988 )
							if( k <= 13.9584 )
								if( d <= 4.44239 )
									ret := 0.100000
								if( d > 4.44239 )
									ret := -0.745098 // sell
							if( k > 13.9584 )
								if( VIM <= 1.42113 )
									ret := -0.106122
								if( VIM > 1.42113 )
									ret := 0.420290
						if( VIP > 0.75988 )
							if( d_k <= -16.7159 )
								if( VIM <= 1.1377 )
									ret := 0.250000
								if( VIM > 1.1377 )
									ret := 0.062500
							if( d_k > -16.7159 )
								if( d_k <= -11.3103 )
									ret := -0.081452
								if( d_k > -11.3103 )
									ret := 0.068338
					if( d > 44.1771 )
						if( k <= 52.2687 )
							if( rsi1 <= 40.0324 )
								if( VIM <= 1.09788 )
									ret := -1.000000 // sell
								if( VIM > 1.09788 )
									ret := -0.750000 // sell
							if( rsi1 > 40.0324 )
								ret := 0.000000
						if( k > 52.2687 )
							if( d_k <= -7.06449 )
								if( VIP <= 1.00688 )
									ret := -0.133333
								if( VIP > 1.00688 )
									ret := -0.638889
							if( d_k > -7.06449 )
								if( VIM <= 1.09265 )
									ret := 0.916667 // buy
								if( VIM > 1.09265 )
									ret := -0.250000
			if( d_k > -6.1698 )
				if( k <= 49.3516 )
					if( rsi1 <= 31.6367 )
						if( smoothD_d <= 35.7244 )
							if( rsi1 <= 10.7464 )
								if( VIP_VIM <= -0.9629 )
									ret := 0.360656
								if( VIP_VIM > -0.9629 )
									ret := -0.176883
							if( rsi1 > 10.7464 )
								if( VIP <= 0.833193 )
									ret := 0.141520
								if( VIP > 0.833193 )
									ret := 0.060163
						if( smoothD_d > 35.7244 )
							if( rsi1 <= 22.2496 )
								if( VIP <= 0.721389 )
									ret := 0.771429 // buy
								if( VIP > 0.721389 )
									ret := 0.318841
							if( rsi1 > 22.2496 )
								if( k <= 28.4337 )
									ret := 0.013986
								if( k > 28.4337 )
									ret := 0.323404
					if( rsi1 > 31.6367 )
						if( VIP_VIM <= -0.32532 )
							if( d <= 14.5438 )
								if( d_k <= 4.79879 )
									ret := -0.073064
								if( d_k > 4.79879 )
									ret := -0.451923
							if( d > 14.5438 )
								if( smoothK_k <= 45.5196 )
									ret := 0.005947
								if( smoothK_k > 45.5196 )
									ret := 0.800000 // buy
						if( VIP_VIM > -0.32532 )
							if( d_k <= 28.3415 )
								if( smoothD_d <= 20.2827 )
									ret := 0.099832
								if( smoothD_d > 20.2827 )
									ret := 0.030343
							if( d_k > 28.3415 )
								if( VIP_VIM <= 0.001304 )
									ret := 0.597561
								if( VIP_VIM > 0.001304 )
									ret := -0.375000
				if( k > 49.3516 )
					if( d_k <= -5.58665 )
						if( smoothK_k <= 49.3754 )
							if( rsi1 <= 39.8213 )
								ret := 0.000000
							if( rsi1 > 39.8213 )
								ret := 0.714286 // buy
						if( smoothK_k > 49.3754 )
							if( VIM <= 1.06202 )
								ret := -0.250000
							if( VIM > 1.06202 )
								ret := 0.000000
					if( d_k > -5.58665 )
						if( VIP_VIM <= -0.013009 )
							if( d_k <= -2.89397 )
								if( k <= 52.1097 )
									ret := -0.435897
								if( k > 52.1097 )
									ret := -0.875000 // sell
							if( d_k > -2.89397 )
								ret := -1.000000 // sell
						if( VIP_VIM > -0.013009 )
							if( rsi1 <= 43.3339 )
								ret := 0.750000 // buy
							if( rsi1 > 43.3339 )
								if( rsi1 <= 48.051 )
									ret := 0.000000
								if( rsi1 > 48.051 )
									ret := -0.750000 // sell
		if( d > 47.8385 )
			if( k <= 29.8901 )
				if( d_k <= 26.8395 )
					if( VIP_VIM <= -0.606465 )
						ret := -0.333333
					if( VIP_VIM > -0.606465 )
						if( d_k <= 21.0618 )
							if( d_k <= 20.4751 )
								if( rsi1 <= 37.2724 )
									ret := 0.000000
								if( rsi1 > 37.2724 )
									ret := 0.333333
							if( d_k > 20.4751 )
								ret := -0.500000
						if( d_k > 21.0618 )
							if( VIP <= 0.912265 )
								if( VIM <= 1.10034 )
									ret := 1.000000 // buy
								if( VIM > 1.10034 )
									ret := 0.780488 // buy
							if( VIP > 0.912265 )
								if( d_k <= 24.7388 )
									ret := 0.700000 // buy
								if( d_k > 24.7388 )
									ret := 0.260870
				if( d_k > 26.8395 )
					if( VIM <= 1.03326 )
						if( k <= 27.2268 )
							if( smoothK_k <= 21.3315 )
								ret := 1.000000 // buy
							if( smoothK_k > 21.3315 )
								if( smoothK_k <= 22.6026 )
									ret := 0.250000
								if( smoothK_k > 22.6026 )
									ret := 1.000000 // buy
						if( k > 27.2268 )
							ret := 0.250000
					if( VIM > 1.03326 )
						if( d_k <= 28.8024 )
							if( d <= 49.0386 )
								if( d <= 48.2925 )
									ret := -0.500000
								if( d > 48.2925 )
									ret := -1.000000 // sell
							if( d > 49.0386 )
								if( d <= 49.4899 )
									ret := 0.750000 // buy
								if( d > 49.4899 )
									ret := -0.161290
						if( d_k > 28.8024 )
							if( rsi1 <= 29.8195 )
								if( d_k <= 32.8686 )
									ret := 0.840909 // buy
								if( d_k > 32.8686 )
									ret := 0.000000
							if( rsi1 > 29.8195 )
								if( rsi1 <= 40.6171 )
									ret := -0.272727
								if( rsi1 > 40.6171 )
									ret := 0.117647
			if( k > 29.8901 )
				if( VIP <= 0.69985 )
					if( d_k <= 5.35305 )
						if( d_k <= -2.56514 )
							if( VIP <= 0.682401 )
								if( VIM <= 1.24671 )
									ret := -0.800000 // sell
								if( VIM > 1.24671 )
									ret := 0.387097
							if( VIP > 0.682401 )
								if( d_k <= -10.505 )
									ret := 0.166667
								if( d_k > -10.505 )
									ret := 1.000000 // buy
						if( d_k > -2.56514 )
							if( VIM <= 1.24934 )
								if( rsi1 <= 30.3436 )
									ret := 0.823529 // buy
								if( rsi1 > 30.3436 )
									ret := -0.600000
							if( VIM > 1.24934 )
								if( VIP <= 0.68075 )
									ret := -0.312500
								if( VIP > 0.68075 )
									ret := -0.916667 // sell
					if( d_k > 5.35305 )
						if( VIM <= 0.911692 )
							ret := -0.500000
						if( VIM > 0.911692 )
							if( VIP_VIM <= -0.401517 )
								if( rsi1 <= 30.2174 )
									ret := 0.684932
								if( rsi1 > 30.2174 )
									ret := -0.125000
							if( VIP_VIM > -0.401517 )
								if( k <= 34.175 )
									ret := 0.750000 // buy
								if( k > 34.175 )
									ret := 0.961538 // buy
				if( VIP > 0.69985 )
					if( VIP_VIM <= -0.272906 )
						if( rsi1 <= 34.4468 )
							if( VIP <= 0.786251 )
								if( VIP_VIM <= -0.439305 )
									ret := 0.019934
								if( VIP_VIM > -0.439305 )
									ret := -0.363636
							if( VIP > 0.786251 )
								if( k <= 38.4747 )
									ret := -0.365079
								if( k > 38.4747 )
									ret := 0.225765
						if( rsi1 > 34.4468 )
							if( VIM <= 1.13765 )
								if( k <= 71.5883 )
									ret := -0.531250
								if( k > 71.5883 )
									ret := 0.000000
							if( VIM > 1.13765 )
								if( d_k <= 7.40173 )
									ret := -0.114569
								if( d_k > 7.40173 )
									ret := 0.150000
					if( VIP_VIM > -0.272906 )
						if( d <= 51.1165 )
							if( d_k <= -11.3058 )
								if( smoothK_k <= 70.5191 )
									ret := 0.676471
								if( smoothK_k > 70.5191 )
									ret := 0.296296
							if( d_k > -11.3058 )
								if( rsi1 <= 38.7409 )
									ret := -0.220930
								if( rsi1 > 38.7409 )
									ret := 0.253731
						if( d > 51.1165 )
							if( d <= 61.3305 )
								if( rsi1 <= 31.0548 )
									ret := -0.622951
								if( rsi1 > 31.0548 )
									ret := 0.061728
							if( d > 61.3305 )
								if( rsi1 <= 34.7557 )
									ret := 0.318707
								if( rsi1 > 34.7557 )
									ret := 0.120152
	if( rsi1 > 49.749 )
		if( VIP_VIM <= -0.026641 )
			if( d <= 88.3213 )
				if( smoothK_k <= 60.6938 )
					if( d <= 10.3839 )
						if( rsi1 <= 52.3275 )
							if( rsi1 <= 49.9131 )
								if( VIM <= 1.04862 )
									ret := 1.000000 // buy
								if( VIM > 1.04862 )
									ret := 0.000000
							if( rsi1 > 49.9131 )
								if( d_k <= -4.69656 )
									ret := -0.276596
								if( d_k > -4.69656 )
									ret := 0.067961
						if( rsi1 > 52.3275 )
							if( smoothD_d <= 4.2553 )
								if( smoothD_d <= 1.76508 )
									ret := 0.428571
								if( smoothD_d > 1.76508 )
									ret := -0.230769
							if( smoothD_d > 4.2553 )
								if( d_k <= -10.8344 )
									ret := 0.000000
								if( d_k > -10.8344 )
									ret := 0.800000 // buy
					if( d > 10.3839 )
						if( smoothK_k <= 9.55547 )
							if( d <= 35.4962 )
								if( smoothK_k <= 4.0185 )
									ret := -0.250000
								if( smoothK_k > 4.0185 )
									ret := -0.541667
							if( d > 35.4962 )
								ret := 0.800000 // buy
						if( smoothK_k > 9.55547 )
							if( VIP_VIM <= -0.028004 )
								if( VIP <= 0.901403 )
									ret := -0.270270
								if( VIP > 0.901403 )
									ret := -0.086386
							if( VIP_VIM > -0.028004 )
								if( rsi1 <= 55.3162 )
									ret := -0.866667 // sell
								if( rsi1 > 55.3162 )
									ret := -0.250000
				if( smoothK_k > 60.6938 )
					if( VIP <= 0.946901 )
						if( d_k <= -15.4941 )
							if( rsi1 <= 61.4328 )
								if( rsi1 <= 51.2411 )
									ret := -0.078947
								if( rsi1 > 51.2411 )
									ret := 0.652174
							if( rsi1 > 61.4328 )
								ret := -0.666667
						if( d_k > -15.4941 )
							if( rsi1 <= 57.6684 )
								if( rsi1 <= 50.838 )
									ret := -0.188889
								if( rsi1 > 50.838 )
									ret := -0.641026
							if( rsi1 > 57.6684 )
								if( smoothD_d <= 63.6897 )
									ret := 0.000000
								if( smoothD_d > 63.6897 )
									ret := 0.800000 // buy
					if( VIP > 0.946901 )
						if( d_k <= 7.65589 )
							if( k <= 74.8686 )
								if( d_k <= -31.1428 )
									ret := 0.750000 // buy
								if( d_k > -31.1428 )
									ret := -0.094771
							if( k > 74.8686 )
								if( k <= 75.8359 )
									ret := 0.457143
								if( k > 75.8359 )
									ret := 0.075472
						if( d_k > 7.65589 )
							if( smoothK_k <= 66.8704 )
								if( smoothK_k <= 62.8747 )
									ret := 0.000000
								if( smoothK_k > 62.8747 )
									ret := 0.666667
							if( smoothK_k > 66.8704 )
								if( k <= 70.6993 )
									ret := -0.750000 // sell
								if( k > 70.6993 )
									ret := -0.055556
			if( d > 88.3213 )
				if( VIP <= 1.13709 )
					if( d_k <= -5.32699 )
						if( VIP_VIM <= -0.050711 )
							if( rsi1 <= 50.0649 )
								ret := -0.400000
							if( rsi1 > 50.0649 )
								if( d_k <= -6.74386 )
									ret := -0.818182 // sell
								if( d_k > -6.74386 )
									ret := -1.000000 // sell
						if( VIP_VIM > -0.050711 )
							if( rsi1 <= 56.1961 )
								ret := 0.000000
							if( rsi1 > 56.1961 )
								ret := -0.800000 // sell
					if( d_k > -5.32699 )
						if( d <= 97.0143 )
							if( d <= 95.9675 )
								if( VIP_VIM <= -0.151952 )
									ret := 0.162162
								if( VIP_VIM > -0.151952 )
									ret := -0.318182
							if( d > 95.9675 )
								if( d_k <= -3.25753 )
									ret := -0.285714
								if( d_k > -3.25753 )
									ret := -0.820513 // sell
						if( d > 97.0143 )
							if( d_k <= -0.042846 )
								if( rsi1 <= 53.5465 )
									ret := 0.481481
								if( rsi1 > 53.5465 )
									ret := -0.200000
							if( d_k > -0.042846 )
								if( rsi1 <= 50.0158 )
									ret := 0.000000
								if( rsi1 > 50.0158 )
									ret := -0.619048
				if( VIP > 1.13709 )
					if( smoothD_d <= 96.3272 )
						if( smoothD_d <= 92.1788 )
							if( smoothD_d <= 91.8155 )
								if( rsi1 <= 57.7483 )
									ret := -0.062500
								if( rsi1 > 57.7483 )
									ret := 0.300000
							if( smoothD_d > 91.8155 )
								ret := 1.000000 // buy
						if( smoothD_d > 92.1788 )
							if( smoothD_d <= 93.1902 )
								ret := -0.250000
							if( smoothD_d > 93.1902 )
								ret := 0.000000
					if( smoothD_d > 96.3272 )
						ret := -0.600000
		if( VIP_VIM > -0.026641 )
			if( d <= 63.9682 )
				if( k <= 80.8815 )
					if( rsi1 <= 61.1248 )
						if( smoothK_k <= 23.1147 )
							if( rsi1 <= 57.8458 )
								if( VIM <= 0.991312 )
									ret := 0.071174
								if( VIM > 0.991312 )
									ret := -0.037736
							if( rsi1 > 57.8458 )
								if( d <= 0.066846 )
									ret := -0.666667
								if( d > 0.066846 )
									ret := 0.219231
						if( smoothK_k > 23.1147 )
							if( smoothK_k <= 34.6161 )
								if( VIM <= 0.888453 )
									ret := 0.134259
								if( VIM > 0.888453 )
									ret := -0.082233
							if( smoothK_k > 34.6161 )
								if( VIP <= 1.0908 )
									ret := 0.063057
								if( VIP > 1.0908 )
									ret := -0.047472
					if( rsi1 > 61.1248 )
						if( VIP <= 1.19332 )
							if( d <= 51.5888 )
								if( k <= 24.2011 )
									ret := -0.235955
								if( k > 24.2011 )
									ret := 0.032258
							if( d > 51.5888 )
								if( smoothK_k <= 54.1166 )
									ret := -0.331034
								if( smoothK_k > 54.1166 )
									ret := -0.102857
						if( VIP > 1.19332 )
							if( smoothK_k <= 57.8191 )
								if( k <= 55.2025 )
									ret := 0.026812
								if( k > 55.2025 )
									ret := 0.245000
							if( smoothK_k > 57.8191 )
								if( smoothD_d <= 47.6569 )
									ret := -0.302326
								if( smoothD_d > 47.6569 )
									ret := 0.026936
				if( k > 80.8815 )
					if( VIM <= 0.817147 )
						if( rsi1 <= 72.1147 )
							if( k <= 82.9194 )
								ret := -0.500000
							if( k > 82.9194 )
								if( k <= 84.1469 )
									ret := 1.000000 // buy
								if( k > 84.1469 )
									ret := 0.307692
						if( rsi1 > 72.1147 )
							if( VIP_VIM <= 0.504602 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.504602 )
								if( smoothD_d <= 55.9778 )
									ret := 0.000000
								if( smoothD_d > 55.9778 )
									ret := 0.882353 // buy
					if( VIM > 0.817147 )
						if( rsi1 <= 73.1221 )
							if( d_k <= -22.1785 )
								if( d <= 57.4219 )
									ret := 0.213483
								if( d > 57.4219 )
									ret := -0.219780
							if( d_k > -22.1785 )
								if( VIP <= 1.11327 )
									ret := 0.627907
								if( VIP > 1.11327 )
									ret := 0.117647
						if( rsi1 > 73.1221 )
							if( rsi1 <= 77.3799 )
								if( VIP <= 1.1399 )
									ret := 0.250000
								if( VIP > 1.1399 )
									ret := 0.937500 // buy
							if( rsi1 > 77.3799 )
								ret := 0.000000
			if( d > 63.9682 )
				if( k <= 70.054 )
					if( smoothD_d <= 79.4048 )
						if( d_k <= 0.952439 )
							if( VIP <= 1.25007 )
								if( VIM <= 0.80021 )
									ret := 0.830508 // buy
								if( VIM > 0.80021 )
									ret := 0.325472
							if( VIP > 1.25007 )
								if( d <= 69.3404 )
									ret := 0.060606
								if( d > 69.3404 )
									ret := -1.000000 // sell
						if( d_k > 0.952439 )
							if( VIM <= 0.73248 )
								if( rsi1 <= 76.5761 )
									ret := -0.515464
								if( rsi1 > 76.5761 )
									ret := 0.111111
							if( VIM > 0.73248 )
								if( smoothD_d <= 67.026 )
									ret := 0.162099
								if( smoothD_d > 67.026 )
									ret := 0.005217
					if( smoothD_d > 79.4048 )
						if( VIP_VIM <= 0.143544 )
							if( d <= 82.9358 )
								ret := -0.400000
							if( d > 82.9358 )
								if( d <= 84.0022 )
									ret := 0.583333
								if( d > 84.0022 )
									ret := 0.000000
						if( VIP_VIM > 0.143544 )
							if( k <= 66.0069 )
								if( VIM <= 0.736097 )
									ret := -0.833333 // sell
								if( VIM > 0.736097 )
									ret := 0.511628
							if( k > 66.0069 )
								if( d_k <= 14.508 )
									ret := 0.333333
								if( d_k > 14.508 )
									ret := 0.777778 // buy
				if( k > 70.054 )
					if( rsi1 <= 91.0053 )
						if( k <= 94.9153 )
							if( VIM <= 0.813217 )
								if( smoothD_d <= 69.4467 )
									ret := -0.305455
								if( smoothD_d > 69.4467 )
									ret := 0.003899
							if( VIM > 0.813217 )
								if( d <= 67.7137 )
									ret := -0.098696
								if( d > 67.7137 )
									ret := 0.083634
						if( k > 94.9153 )
							if( rsi1 <= 75.5057 )
								if( VIP_VIM <= 0.38483 )
									ret := -0.004825
								if( VIP_VIM > 0.38483 )
									ret := -0.203620
							if( rsi1 > 75.5057 )
								if( rsi1 <= 78.3312 )
									ret := 0.257253
								if( rsi1 > 78.3312 )
									ret := 0.010585
					if( rsi1 > 91.0053 )
						if( smoothD_d <= 96.9416 )
							if( smoothD_d <= 96.5529 )
								if( rsi1 <= 93.8118 )
									ret := 0.346154
								if( rsi1 > 93.8118 )
									ret := -0.036697
							if( smoothD_d > 96.5529 )
								if( rsi1 <= 94.1764 )
									ret := 0.071429
								if( rsi1 > 94.1764 )
									ret := -0.687500
						if( smoothD_d > 96.9416 )
							if( VIP_VIM <= 1.04152 )
								if( VIM <= 0.741302 )
									ret := 0.702703 // buy
								if( VIM > 0.741302 )
									ret := 0.000000
							if( VIP_VIM > 1.04152 )
								if( VIP_VIM <= 1.09957 )
									ret := -0.166667
								if( VIP_VIM > 1.09957 )
									ret := -0.666667
	
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
float op_operation = decision_tree_0_NIO_5Min_5439582e(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


