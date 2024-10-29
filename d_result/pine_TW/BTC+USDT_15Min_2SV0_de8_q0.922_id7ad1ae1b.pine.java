//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: BTCUSDT_15Min_2SV0_7ad1ae1b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_2SV0_7ad1ae1b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_7ad1ae1b(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 49.7726 )
		if( VIM <= 1.00944 )
			if( rsi1 <= 41.3072 )
				if( VIP_VIM <= -0.080332 )
					if( k <= 7.72232 )
						if( smoothD_d <= 0.024456 )
							if( VIM <= 1.00231 )
								ret := -1.000000 // sell
							if( VIM > 1.00231 )
								ret := -0.888889 // sell
						if( smoothD_d > 0.024456 )
							if( smoothK_k <= 0.432907 )
								ret := -0.230769
							if( smoothK_k > 0.432907 )
								if( VIM <= 0.978505 )
									ret := -1.000000 // sell
								if( VIM > 0.978505 )
									ret := -0.750000 // sell
					if( k > 7.72232 )
						if( VIP <= 0.896976 )
							if( smoothD_d <= 63.3871 )
								if( VIM <= 0.990764 )
									ret := -0.225806
								if( VIM > 0.990764 )
									ret := 0.444444
							if( smoothD_d > 63.3871 )
								ret := 0.842105 // buy
						if( VIP > 0.896976 )
							if( VIP_VIM <= -0.082937 )
								if( VIP_VIM <= -0.093527 )
									ret := -0.272727
								if( VIP_VIM > -0.093527 )
									ret := -0.800000 // sell
							if( VIP_VIM > -0.082937 )
								ret := 0.000000
				if( VIP_VIM > -0.080332 )
					if( d <= 3.4377 )
						if( d_k <= 0.190185 )
							if( smoothK_k <= -0.975475 )
								if( VIP <= 1.07325 )
									ret := -0.830816 // sell
								if( VIP > 1.07325 )
									ret := -0.923445 // sell
							if( smoothK_k > -0.975475 )
								if( rsi1 <= 34.3775 )
									ret := -0.839662 // sell
								if( rsi1 > 34.3775 )
									ret := -0.678947
						if( d_k > 0.190185 )
							if( d <= 3.3428 )
								if( d_k <= 1.21162 )
									ret := -0.634409
								if( d_k > 1.21162 )
									ret := -0.773743 // sell
							if( d > 3.3428 )
								ret := -1.000000 // sell
					if( d > 3.4377 )
						if( VIP <= 0.916267 )
							if( VIP_VIM <= -0.061681 )
								if( k <= 19.4854 )
									ret := -0.111111
								if( k > 19.4854 )
									ret := -0.538462
							if( VIP_VIM > -0.061681 )
								if( smoothD_d <= 28.9484 )
									ret := 0.071429
								if( smoothD_d > 28.9484 )
									ret := 0.625000
						if( VIP > 0.916267 )
							if( rsi1 <= 38.6115 )
								if( rsi1 <= 28.2505 )
									ret := -0.824399 // sell
								if( rsi1 > 28.2505 )
									ret := -0.695312
							if( rsi1 > 38.6115 )
								if( smoothK_k <= 8.5779 )
									ret := -0.445633
								if( smoothK_k > 8.5779 )
									ret := -0.660645
			if( rsi1 > 41.3072 )
				if( VIP_VIM <= 0.063789 )
					if( d_k <= 0.553812 )
						if( VIP_VIM <= -0.016792 )
							if( rsi1 <= 47.9434 )
								if( smoothK_k <= 66.1136 )
									ret := -0.292373
								if( smoothK_k > 66.1136 )
									ret := 0.250000
							if( rsi1 > 47.9434 )
								if( rsi1 <= 48.7436 )
									ret := 0.500000
								if( rsi1 > 48.7436 )
									ret := -0.116667
						if( VIP_VIM > -0.016792 )
							if( VIM <= 0.926806 )
								ret := 0.727273 // buy
							if( VIM > 0.926806 )
								if( smoothK_k <= 90.8109 )
									ret := -0.391742
								if( smoothK_k > 90.8109 )
									ret := 0.406250
					if( d_k > 0.553812 )
						if( d <= 92.2602 )
							if( rsi1 <= 45.2883 )
								if( k <= 15.912 )
									ret := -0.020725
								if( k > 15.912 )
									ret := -0.400000
							if( rsi1 > 45.2883 )
								if( VIP <= 0.983666 )
									ret := 0.296407
								if( VIP > 0.983666 )
									ret := -0.071605
						if( d > 92.2602 )
							if( k <= 87.2911 )
								if( smoothK_k <= 82.2616 )
									ret := 0.727273 // buy
								if( smoothK_k > 82.2616 )
									ret := 0.954545 // buy
							if( k > 87.2911 )
								if( smoothD_d <= 93.6636 )
									ret := -0.160000
								if( smoothD_d > 93.6636 )
									ret := 0.400000
				if( VIP_VIM > 0.063789 )
					if( d_k <= 21.0006 )
						if( rsi1 <= 47.9987 )
							if( d_k <= 9.99306 )
								if( k <= 2.64874 )
									ret := -0.385827
								if( k > 2.64874 )
									ret := -0.524180
							if( d_k > 9.99306 )
								if( k <= 49.4305 )
									ret := -0.682234
								if( k > 49.4305 )
									ret := -0.360465
						if( rsi1 > 47.9987 )
							if( d <= 1.67128 )
								if( VIP_VIM <= 0.459055 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.459055 )
									ret := -0.733333 // sell
							if( d > 1.67128 )
								if( VIM <= 0.787888 )
									ret := -0.791304 // sell
								if( VIM > 0.787888 )
									ret := -0.372582
					if( d_k > 21.0006 )
						if( rsi1 <= 47.3792 )
							if( k <= 2.65696 )
								ret := 0.222222
							if( k > 2.65696 )
								if( k <= 9.12267 )
									ret := -0.804348 // sell
								if( k > 9.12267 )
									ret := -0.318052
						if( rsi1 > 47.3792 )
							if( VIP_VIM <= 0.281368 )
								if( smoothD_d <= 38.1754 )
									ret := -0.214286
								if( smoothD_d > 38.1754 )
									ret := 0.262500
							if( VIP_VIM > 0.281368 )
								if( smoothK_k <= 12.628 )
									ret := 0.105263
								if( smoothK_k > 12.628 )
									ret := -0.476190
		if( VIM > 1.00944 )
			if( k <= 22.5812 )
				if( rsi1 <= 27.1302 )
					if( VIP_VIM <= -0.353203 )
						if( k <= 1.62948 )
							if( rsi1 <= 18.9032 )
								if( VIP <= 0.751806 )
									ret := -0.230274
								if( VIP > 0.751806 )
									ret := -0.865546 // sell
							if( rsi1 > 18.9032 )
								if( VIM <= 1.21376 )
									ret := -0.004545
								if( VIM > 1.21376 )
									ret := 0.500000
						if( k > 1.62948 )
							if( d_k <= 3.08221 )
								if( d <= 19.1313 )
									ret := -0.330290
								if( d > 19.1313 )
									ret := 0.289855
							if( d_k > 3.08221 )
								if( d_k <= 3.22511 )
									ret := 0.863636 // buy
								if( d_k > 3.22511 )
									ret := -0.065250
					if( VIP_VIM > -0.353203 )
						if( VIM <= 1.13598 )
							if( smoothK_k <= -0.455537 )
								if( rsi1 <= 23.1805 )
									ret := -0.945455 // sell
								if( rsi1 > 23.1805 )
									ret := -0.759760 // sell
							if( smoothK_k > -0.455537 )
								if( VIP <= 0.766458 )
									ret := 0.000000
								if( VIP > 0.766458 )
									ret := -0.790605 // sell
						if( VIM > 1.13598 )
							if( rsi1 <= 22.0116 )
								if( k <= 8.79381 )
									ret := -0.883621 // sell
								if( k > 8.79381 )
									ret := -0.534483
							if( rsi1 > 22.0116 )
								if( d <= 17.0186 )
									ret := -0.478395
								if( d > 17.0186 )
									ret := 0.028037
				if( rsi1 > 27.1302 )
					if( rsi1 <= 38.8808 )
						if( VIP <= 0.890353 )
							if( VIP_VIM <= -0.295802 )
								if( k <= 4.58421 )
									ret := 0.423704
								if( k > 4.58421 )
									ret := -0.039616
							if( VIP_VIM > -0.295802 )
								if( d <= 7.96363 )
									ret := -0.273779
								if( d > 7.96363 )
									ret := -0.037037
						if( VIP > 0.890353 )
							if( VIP_VIM <= -0.137375 )
								if( smoothD_d <= 25.4161 )
									ret := -0.343360
								if( smoothD_d > 25.4161 )
									ret := 0.193548
							if( VIP_VIM > -0.137375 )
								if( d_k <= -1.50888 )
									ret := -0.747036 // sell
								if( d_k > -1.50888 )
									ret := -0.537079
					if( rsi1 > 38.8808 )
						if( d_k <= -6.83016 )
							if( VIP <= 0.919848 )
								if( rsi1 <= 45.4541 )
									ret := -0.118881
								if( rsi1 > 45.4541 )
									ret := 0.384615
							if( VIP > 0.919848 )
								if( rsi1 <= 45.9149 )
									ret := -0.520000
								if( rsi1 > 45.9149 )
									ret := -0.129412
						if( d_k > -6.83016 )
							if( d <= 2.37484 )
								if( VIM <= 1.07191 )
									ret := -0.560284
								if( VIM > 1.07191 )
									ret := -0.114943
							if( d > 2.37484 )
								if( VIP <= 0.923816 )
									ret := 0.204000
								if( VIP > 0.923816 )
									ret := -0.003913
			if( k > 22.5812 )
				if( d <= 26.9008 )
					if( k <= 28.0917 )
						if( d <= 19.3633 )
							if( rsi1 <= 48.6495 )
								if( VIP_VIM <= -0.150672 )
									ret := -0.186441
								if( VIP_VIM > -0.150672 )
									ret := -0.465587
							if( rsi1 > 48.6495 )
								if( d <= 15.6836 )
									ret := 0.000000
								if( d > 15.6836 )
									ret := 0.750000 // buy
						if( d > 19.3633 )
							if( VIP_VIM <= -0.336021 )
								if( d <= 25.0216 )
									ret := 0.445161
								if( d > 25.0216 )
									ret := -0.112676
							if( VIP_VIM > -0.336021 )
								if( VIP <= 0.804939 )
									ret := 0.777778 // buy
								if( VIP > 0.804939 )
									ret := -0.092421
					if( k > 28.0917 )
						if( rsi1 <= 38.6446 )
							if( VIP <= 0.57478 )
								ret := 0.727273 // buy
							if( VIP > 0.57478 )
								if( rsi1 <= 28.4489 )
									ret := -0.684444
								if( rsi1 > 28.4489 )
									ret := -0.414365
						if( rsi1 > 38.6446 )
							if( d_k <= -15.6394 )
								if( VIP_VIM <= -0.116856 )
									ret := -0.302083
								if( VIP_VIM > -0.116856 )
									ret := -0.638889
							if( d_k > -15.6394 )
								if( VIP <= 0.842821 )
									ret := 0.234783
								if( VIP > 0.842821 )
									ret := -0.169343
				if( d > 26.9008 )
					if( VIP_VIM <= -0.316321 )
						if( rsi1 <= 37.7046 )
							if( rsi1 <= 30.2868 )
								if( k <= 39.4322 )
									ret := 0.069884
								if( k > 39.4322 )
									ret := -0.231810
							if( rsi1 > 30.2868 )
								if( VIP_VIM <= -0.49651 )
									ret := 0.414894
								if( VIP_VIM > -0.49651 )
									ret := -0.041614
						if( rsi1 > 37.7046 )
							if( VIP <= 0.760187 )
								if( VIP <= 0.715853 )
									ret := 0.761523 // buy
								if( VIP > 0.715853 )
									ret := 0.580470
							if( VIP > 0.760187 )
								if( VIM <= 1.22516 )
									ret := 0.386364
								if( VIM > 1.22516 )
									ret := 0.147799
					if( VIP_VIM > -0.316321 )
						if( VIP_VIM <= -0.036854 )
							if( d_k <= -18.5704 )
								if( smoothD_d <= 68.8828 )
									ret := -0.217391
								if( smoothD_d > 68.8828 )
									ret := -0.822581 // sell
							if( d_k > -18.5704 )
								if( smoothD_d <= 92.1029 )
									ret := -0.030253
								if( smoothD_d > 92.1029 )
									ret := 0.228883
						if( VIP_VIM > -0.036854 )
							if( d <= 96.418 )
								if( rsi1 <= 39.8791 )
									ret := -0.614379
								if( rsi1 > 39.8791 )
									ret := -0.181734
							if( d > 96.418 )
								if( smoothK_k <= 94.8279 )
									ret := -1.000000 // sell
								if( smoothK_k > 94.8279 )
									ret := -0.600000
	if( rsi1 > 49.7726 )
		if( rsi1 <= 67.1137 )
			if( VIP_VIM <= -0.029651 )
				if( smoothD_d <= 30.2556 )
					if( k <= 22.0887 )
						if( d <= 4.40745 )
							ret := 0.363636
						if( d > 4.40745 )
							if( k <= 5.88994 )
								ret := 0.166667
							if( k > 5.88994 )
								if( d <= 11.9383 )
									ret := -0.636364
								if( d > 11.9383 )
									ret := -0.090909
					if( k > 22.0887 )
						if( VIP <= 0.950868 )
							if( smoothK_k <= 20.8239 )
								if( VIP <= 0.940736 )
									ret := 0.800000 // buy
								if( VIP > 0.940736 )
									ret := 1.000000 // buy
							if( smoothK_k > 20.8239 )
								if( smoothD_d <= 20.0246 )
									ret := 0.077778
								if( smoothD_d > 20.0246 )
									ret := 0.447826
						if( VIP > 0.950868 )
							if( d <= 14.1315 )
								if( k <= 27.9612 )
									ret := -0.125000
								if( k > 27.9612 )
									ret := -0.562500
							if( d > 14.1315 )
								if( k <= 30.5425 )
									ret := 0.447917
								if( k > 30.5425 )
									ret := 0.044177
				if( smoothD_d > 30.2556 )
					if( rsi1 <= 57.1111 )
						if( k <= 28.5368 )
							ret := -0.384615
						if( k > 28.5368 )
							if( VIP <= 0.975005 )
								if( VIP <= 0.863818 )
									ret := 0.624906
								if( VIP > 0.863818 )
									ret := 0.457033
							if( VIP > 0.975005 )
								if( VIM <= 1.12348 )
									ret := 0.284000
								if( VIM > 1.12348 )
									ret := -0.306122
					if( rsi1 > 57.1111 )
						if( smoothD_d <= 96.704 )
							if( VIP <= 0.961601 )
								if( rsi1 <= 59.7271 )
									ret := 0.595262
								if( rsi1 > 59.7271 )
									ret := 0.704193 // buy
							if( VIP > 0.961601 )
								if( VIM <= 1.09818 )
									ret := 0.528129
								if( VIM > 1.09818 )
									ret := 0.248276
						if( smoothD_d > 96.704 )
							if( VIP_VIM <= -0.276561 )
								if( VIP_VIM <= -0.307203 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.307203 )
									ret := 0.928571 // buy
							if( VIP_VIM > -0.276561 )
								if( d <= 99.9971 )
									ret := 0.892857 // buy
								if( d > 99.9971 )
									ret := 0.648649
			if( VIP_VIM > -0.029651 )
				if( VIM <= 0.80489 )
					if( VIM <= 0.700167 )
						if( VIP_VIM <= 0.487796 )
							if( d_k <= 9.95043 )
								if( VIM <= 0.679431 )
									ret := -0.777778 // sell
								if( VIM > 0.679431 )
									ret := -0.545455
							if( d_k > 9.95043 )
								if( VIP <= 1.12709 )
									ret := 0.181818
								if( VIP > 1.12709 )
									ret := 0.888889 // buy
						if( VIP_VIM > 0.487796 )
							if( k <= 50.9388 )
								if( smoothD_d <= 44.8232 )
									ret := -0.704301 // sell
								if( smoothD_d > 44.8232 )
									ret := -0.445860
							if( k > 50.9388 )
								if( d <= 80.4159 )
									ret := -0.459459
								if( d > 80.4159 )
									ret := 0.037037
					if( VIM > 0.700167 )
						if( rsi1 <= 59.516 )
							if( d_k <= 24.6684 )
								if( d <= 4.8616 )
									ret := -0.229508
								if( d > 4.8616 )
									ret := -0.486486
							if( d_k > 24.6684 )
								if( d_k <= 30.2225 )
									ret := -0.122807
								if( d_k > 30.2225 )
									ret := 0.357143
						if( rsi1 > 59.516 )
							if( d_k <= 0.262771 )
								if( rsi1 <= 66.7598 )
									ret := -0.412338
								if( rsi1 > 66.7598 )
									ret := 0.459459
							if( d_k > 0.262771 )
								if( smoothK_k <= 20.6572 )
									ret := 0.240741
								if( smoothK_k > 20.6572 )
									ret := -0.048729
				if( VIM > 0.80489 )
					if( rsi1 <= 59.7581 )
						if( VIM <= 0.905188 )
							if( d_k <= 3.27383 )
								if( k <= 4.02738 )
									ret := 0.213115
								if( k > 4.02738 )
									ret := -0.348650
							if( d_k > 3.27383 )
								if( k <= 57.5066 )
									ret := -0.172859
								if( k > 57.5066 )
									ret := 0.050410
						if( VIM > 0.905188 )
							if( d_k <= -0.271136 )
								if( VIP_VIM <= 0.060858 )
									ret := -0.002660
								if( VIP_VIM > 0.060858 )
									ret := -0.160833
							if( d_k > -0.271136 )
								if( rsi1 <= 54.5673 )
									ret := 0.036126
								if( rsi1 > 54.5673 )
									ret := 0.152698
					if( rsi1 > 59.7581 )
						if( VIM <= 0.940108 )
							if( k <= 92.811 )
								if( d_k <= 4.86049 )
									ret := 0.040280
								if( d_k > 4.86049 )
									ret := 0.229947
							if( k > 92.811 )
								if( VIP_VIM <= 0.22804 )
									ret := -0.038721
								if( VIP_VIM > 0.22804 )
									ret := -0.354198
						if( VIM > 0.940108 )
							if( VIP <= 1.05987 )
								if( d_k <= -0.928779 )
									ret := 0.501099
								if( d_k > -0.928779 )
									ret := 0.649471
							if( VIP > 1.05987 )
								if( d_k <= -6.91106 )
									ret := -0.033854
								if( d_k > -6.91106 )
									ret := 0.264601
		if( rsi1 > 67.1137 )
			if( VIM <= 0.870684 )
				if( VIM <= 0.761387 )
					if( smoothD_d <= 67.9541 )
						if( VIP <= 1.37657 )
							if( k <= 45.5734 )
								if( d <= 60.7707 )
									ret := 0.184641
								if( d > 60.7707 )
									ret := 0.913043 // buy
							if( k > 45.5734 )
								if( d_k <= -27.1147 )
									ret := -0.511111
								if( d_k > -27.1147 )
									ret := -0.040491
						if( VIP > 1.37657 )
							if( smoothK_k <= 26.4079 )
								if( rsi1 <= 76.9458 )
									ret := -0.442308
								if( rsi1 > 76.9458 )
									ret := 0.600000
							if( smoothK_k > 26.4079 )
								if( d_k <= 0.880786 )
									ret := -0.068966
								if( d_k > 0.880786 )
									ret := -0.839286 // sell
					if( smoothD_d > 67.9541 )
						if( d_k <= 8.53458 )
							if( d_k <= -12.8964 )
								if( VIP <= 1.11792 )
									ret := 0.846154 // buy
								if( VIP > 1.11792 )
									ret := -0.370000
							if( d_k > -12.8964 )
								if( smoothK_k <= 78.8626 )
									ret := 0.091195
								if( smoothK_k > 78.8626 )
									ret := 0.239462
						if( d_k > 8.53458 )
							if( rsi1 <= 87.3977 )
								if( d <= 78.3991 )
									ret := 0.333333
								if( d > 78.3991 )
									ret := 0.700680 // buy
							if( rsi1 > 87.3977 )
								ret := -0.933333 // sell
				if( VIM > 0.761387 )
					if( rsi1 <= 74.2592 )
						if( k <= 69.6816 )
							if( d_k <= -27.4874 )
								ret := -0.833333 // sell
							if( d_k > -27.4874 )
								if( smoothD_d <= 73.8684 )
									ret := 0.337716
								if( smoothD_d > 73.8684 )
									ret := 0.750000 // buy
						if( k > 69.6816 )
							if( d_k <= -2.82565 )
								if( smoothD_d <= 91.0949 )
									ret := 0.061117
								if( smoothD_d > 91.0949 )
									ret := -0.430380
							if( d_k > -2.82565 )
								if( VIP <= 1.12858 )
									ret := 0.485437
								if( VIP > 1.12858 )
									ret := 0.175592
					if( rsi1 > 74.2592 )
						if( rsi1 <= 79.6298 )
							if( VIP <= 1.18415 )
								if( k <= 45.7506 )
									ret := 0.074074
								if( k > 45.7506 )
									ret := 0.736999 // buy
							if( VIP > 1.18415 )
								if( k <= 92.2603 )
									ret := 0.567108
								if( k > 92.2603 )
									ret := -0.186147
						if( rsi1 > 79.6298 )
							if( VIP_VIM <= 0.369861 )
								if( k <= 96.8941 )
									ret := 0.870130 // buy
								if( k > 96.8941 )
									ret := 0.936963 // buy
							if( VIP_VIM > 0.369861 )
								if( VIP_VIM <= 0.372204 )
									ret := 0.000000
								if( VIP_VIM > 0.372204 )
									ret := 0.727599 // buy
			if( VIM > 0.870684 )
				if( VIP <= 1.13918 )
					if( rsi1 <= 72.4948 )
						if( VIM <= 0.912017 )
							if( k <= 93.1303 )
								if( VIP <= 1.11056 )
									ret := 0.716129 // buy
								if( VIP > 1.11056 )
									ret := 0.505208
							if( k > 93.1303 )
								if( d <= 99.9998 )
									ret := 0.437186
								if( d > 99.9998 )
									ret := -0.437500
						if( VIM > 0.912017 )
							if( VIP <= 1.05123 )
								if( smoothK_k <= 90.3641 )
									ret := 0.798935 // buy
								if( smoothK_k > 90.3641 )
									ret := 0.683374
							if( VIP > 1.05123 )
								if( k <= 50.946 )
									ret := 0.828571 // buy
								if( k > 50.946 )
									ret := 0.586685
					if( rsi1 > 72.4948 )
						if( rsi1 <= 80.9962 )
							if( d_k <= 4.09238 )
								if( VIM <= 1.16112 )
									ret := 0.788858 // buy
								if( VIM > 1.16112 )
									ret := 0.482143
							if( d_k > 4.09238 )
								if( VIP_VIM <= 0.011685 )
									ret := 0.857143 // buy
								if( VIP_VIM > 0.011685 )
									ret := 0.990099 // buy
						if( rsi1 > 80.9962 )
							if( VIP <= 0.93952 )
								if( rsi1 <= 84.4289 )
									ret := 0.520000
								if( rsi1 > 84.4289 )
									ret := 1.000000 // buy
							if( VIP > 0.93952 )
								if( k <= 99.1535 )
									ret := 0.909938 // buy
								if( k > 99.1535 )
									ret := 0.983092 // buy
				if( VIP > 1.13918 )
					if( rsi1 <= 84.9113 )
						if( d_k <= -21.5872 )
							if( d_k <= -24.9141 )
								ret := 0.583333
							if( d_k > -24.9141 )
								if( smoothK_k <= 65.7703 )
									ret := -0.083333
								if( smoothK_k > 65.7703 )
									ret := -0.687500
						if( d_k > -21.5872 )
							if( VIM <= 1.00587 )
								if( VIM <= 0.875584 )
									ret := 0.610619
								if( VIM > 0.875584 )
									ret := 0.330781
							if( VIM > 1.00587 )
								if( rsi1 <= 70.2144 )
									ret := 1.000000 // buy
								if( rsi1 > 70.2144 )
									ret := 0.454545
					if( rsi1 > 84.9113 )
						if( smoothD_d <= 92.6942 )
							ret := 0.714286 // buy
						if( smoothD_d > 92.6942 )
							if( smoothK_k <= 96.0752 )
								ret := 0.916667 // buy
							if( smoothK_k > 96.0752 )
								ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_BTCUSDT_15Min_7ad1ae1b(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


