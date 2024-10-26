//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: AAPL_1Min_2SV0_d85d2465 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_2SV0_d85d2465", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_d85d2465(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 43.1467 )
		if( rsi1 <= 30.3375 )
			if( d <= 24.7207 )
				if( VIM <= 1.34016 )
					if( VIP_VIM <= -0.370396 )
						if( smoothK_k <= 23.3089 )
							if( rsi1 <= 19.5822 )
								if( d_k <= -5.4474 )
									ret := -0.531915
								if( d_k > -5.4474 )
									ret := 0.205158
							if( rsi1 > 19.5822 )
								if( d <= 9.42269 )
									ret := 0.039002
								if( d > 9.42269 )
									ret := -0.114894
						if( smoothK_k > 23.3089 )
							if( k <= 34.9654 )
								if( d <= 17.9658 )
									ret := 0.219512
								if( d > 17.9658 )
									ret := 0.619048
							if( k > 34.9654 )
								if( rsi1 <= 25.0463 )
									ret := 0.631579
								if( rsi1 > 25.0463 )
									ret := -0.781250 // sell
					if( VIP_VIM > -0.370396 )
						if( k <= 21.708 )
							if( rsi1 <= 27.9109 )
								if( VIP <= 0.767814 )
									ret := 0.882353 // buy
								if( VIP > 0.767814 )
									ret := 0.327273
							if( rsi1 > 27.9109 )
								if( VIM <= 1.13903 )
									ret := -0.074074
								if( VIM > 1.13903 )
									ret := 0.228216
						if( k > 21.708 )
							if( d <= 14.5284 )
								if( d_k <= -10.6645 )
									ret := -0.750000 // sell
								if( d_k > -10.6645 )
									ret := -1.000000 // sell
							if( d > 14.5284 )
								if( k <= 23.3614 )
									ret := -0.636364
								if( k > 23.3614 )
									ret := 0.121212
				if( VIM > 1.34016 )
					if( smoothD_d <= -2.91247 )
						if( VIP <= 0.497098 )
							if( VIP <= 0.437362 )
								ret := 0.250000
							if( VIP > 0.437362 )
								if( VIP_VIM <= -0.964103 )
									ret := -0.666667
								if( VIP_VIM > -0.964103 )
									ret := -1.000000 // sell
						if( VIP > 0.497098 )
							if( VIM <= 1.36971 )
								if( VIM <= 1.34191 )
									ret := 0.500000
								if( VIM > 1.34191 )
									ret := -0.479167
							if( VIM > 1.36971 )
								if( rsi1 <= 21.8753 )
									ret := 0.198276
								if( rsi1 > 21.8753 )
									ret := -0.275862
					if( smoothD_d > -2.91247 )
						if( k <= 7.62975 )
							if( rsi1 <= 5.67673 )
								if( smoothD_d <= 4.20201 )
									ret := 0.803922 // buy
								if( smoothD_d > 4.20201 )
									ret := 0.142857
							if( rsi1 > 5.67673 )
								if( rsi1 <= 16.7883 )
									ret := 0.133917
								if( rsi1 > 16.7883 )
									ret := 0.292666
						if( k > 7.62975 )
							if( VIM <= 1.41357 )
								if( d <= 9.33348 )
									ret := 0.493151
								if( d > 9.33348 )
									ret := 0.167665
							if( VIM > 1.41357 )
								if( rsi1 <= 20.1248 )
									ret := -0.113164
								if( rsi1 > 20.1248 )
									ret := 0.142670
			if( d > 24.7207 )
				if( VIM <= 1.16485 )
					if( VIP <= 0.886168 )
						if( d_k <= 26.3869 )
							if( smoothK_k <= 54.552 )
								if( k <= 55.8339 )
									ret := 0.489177
								if( k > 55.8339 )
									ret := -0.714286 // sell
							if( smoothK_k > 54.552 )
								if( d_k <= 2.45282 )
									ret := 0.913043 // buy
								if( d_k > 2.45282 )
									ret := 0.411765
						if( d_k > 26.3869 )
							if( VIM <= 1.13927 )
								if( smoothD_d <= 40.8115 )
									ret := -0.900000 // sell
								if( smoothD_d > 40.8115 )
									ret := -0.125000
							if( VIM > 1.13927 )
								ret := 0.285714
					if( VIP > 0.886168 )
						if( k <= 21.168 )
							if( k <= 17.066 )
								ret := 0.000000
							if( k > 17.066 )
								ret := 0.857143 // buy
						if( k > 21.168 )
							if( d_k <= 17.3971 )
								if( smoothD_d <= 71.6778 )
									ret := -0.071429
								if( smoothD_d > 71.6778 )
									ret := 0.666667
							if( d_k > 17.3971 )
								if( d <= 53.8472 )
									ret := -0.800000 // sell
								if( d > 53.8472 )
									ret := -0.333333
				if( VIM > 1.16485 )
					if( d_k <= -3.77857 )
						if( VIM <= 1.23976 )
							if( k <= 35.6676 )
								if( k <= 34.5524 )
									ret := 0.500000
								if( k > 34.5524 )
									ret := 0.937500 // buy
							if( k > 35.6676 )
								if( smoothD_d <= 67.5381 )
									ret := 0.245033
								if( smoothD_d > 67.5381 )
									ret := 0.818182 // buy
						if( VIM > 1.23976 )
							if( smoothD_d <= 31.6072 )
								if( rsi1 <= 15.0768 )
									ret := 0.888889 // buy
								if( rsi1 > 15.0768 )
									ret := -0.272727
							if( smoothD_d > 31.6072 )
								if( rsi1 <= 20.6713 )
									ret := -0.390244
								if( rsi1 > 20.6713 )
									ret := 0.221831
					if( d_k > -3.77857 )
						if( VIP_VIM <= -0.386192 )
							if( VIP_VIM <= -1.09962 )
								if( d_k <= 29.086 )
									ret := -0.072581
								if( d_k > 29.086 )
									ret := 0.750000 // buy
							if( VIP_VIM > -1.09962 )
								if( d <= 26.5736 )
									ret := 0.629310
								if( d > 26.5736 )
									ret := 0.280332
						if( VIP_VIM > -0.386192 )
							if( rsi1 <= 22.216 )
								if( rsi1 <= 17.1968 )
									ret := 0.500000
								if( rsi1 > 17.1968 )
									ret := -0.600000
							if( rsi1 > 22.216 )
								if( smoothK_k <= 15.1063 )
									ret := -0.260870
								if( smoothK_k > 15.1063 )
									ret := 0.208145
		if( rsi1 > 30.3375 )
			if( VIP <= 0.880372 )
				if( k <= 82.4567 )
					if( VIP_VIM <= -0.49447 )
						if( d <= 15.1544 )
							if( VIP <= 0.743154 )
								if( k <= 4.18802 )
									ret := 0.111111
								if( k > 4.18802 )
									ret := -0.382609
							if( VIP > 0.743154 )
								if( smoothD_d <= 6.20485 )
									ret := 0.343915
								if( smoothD_d > 6.20485 )
									ret := -0.200000
						if( d > 15.1544 )
							if( rsi1 <= 35.4631 )
								if( rsi1 <= 33.0409 )
									ret := 0.270718
								if( rsi1 > 33.0409 )
									ret := 0.601942
							if( rsi1 > 35.4631 )
								if( smoothD_d <= 15.0268 )
									ret := -0.833333 // sell
								if( smoothD_d > 15.0268 )
									ret := 0.107527
					if( VIP_VIM > -0.49447 )
						if( d_k <= 20.2247 )
							if( VIP <= 0.818053 )
								if( d_k <= 9.03621 )
									ret := -0.100468
								if( d_k > 9.03621 )
									ret := 0.134276
							if( VIP > 0.818053 )
								if( smoothD_d <= 73.1759 )
									ret := 0.047001
								if( smoothD_d > 73.1759 )
									ret := -0.263158
						if( d_k > 20.2247 )
							if( VIP <= 0.788505 )
								if( d_k <= 29.9606 )
									ret := 0.836066 // buy
								if( d_k > 29.9606 )
									ret := -0.400000
							if( VIP > 0.788505 )
								if( VIP_VIM <= -0.207498 )
									ret := 0.253571
								if( VIP_VIM > -0.207498 )
									ret := -0.444444
				if( k > 82.4567 )
					if( VIP_VIM <= -0.289995 )
						if( smoothD_d <= 74.6904 )
							if( smoothD_d <= 59.4924 )
								if( VIP_VIM <= -0.311477 )
									ret := 0.937500 // buy
								if( VIP_VIM > -0.311477 )
									ret := 0.500000
							if( smoothD_d > 59.4924 )
								if( VIM <= 1.1975 )
									ret := -0.457143
								if( VIM > 1.1975 )
									ret := 0.185185
						if( smoothD_d > 74.6904 )
							if( VIP <= 0.756984 )
								if( VIP <= 0.730505 )
									ret := -0.250000
								if( VIP > 0.730505 )
									ret := -1.000000 // sell
							if( VIP > 0.756984 )
								if( smoothD_d <= 94.991 )
									ret := 0.614213
								if( smoothD_d > 94.991 )
									ret := -0.214286
					if( VIP_VIM > -0.289995 )
						if( k <= 86.4175 )
							if( VIP_VIM <= -0.217989 )
								if( VIP <= 0.850681 )
									ret := 0.818182 // buy
								if( VIP > 0.850681 )
									ret := 0.407407
							if( VIP_VIM > -0.217989 )
								ret := -0.250000
						if( k > 86.4175 )
							if( smoothK_k <= 85.0374 )
								if( VIP <= 0.879103 )
									ret := -0.634146
								if( VIP > 0.879103 )
									ret := 0.500000
							if( smoothK_k > 85.0374 )
								if( smoothK_k <= 86.5146 )
									ret := 0.826087 // buy
								if( smoothK_k > 86.5146 )
									ret := -0.158416
			if( VIP > 0.880372 )
				if( d <= 10.3487 )
					if( smoothK_k <= -2.99734 )
						if( VIP <= 0.883492 )
							if( VIM <= 1.12447 )
								ret := 0.500000
							if( VIM > 1.12447 )
								if( VIP <= 0.882641 )
									ret := -1.000000 // sell
								if( VIP > 0.882641 )
									ret := -0.750000 // sell
						if( VIP > 0.883492 )
							if( rsi1 <= 39.9508 )
								if( d_k <= 0.317359 )
									ret := 0.377551
								if( d_k > 0.317359 )
									ret := 0.167315
							if( rsi1 > 39.9508 )
								if( VIP_VIM <= -0.130738 )
									ret := 0.592000
								if( VIP_VIM > -0.130738 )
									ret := 0.287356
					if( smoothK_k > -2.99734 )
						if( smoothD_d <= -1.4108 )
							if( VIM <= 1.45595 )
								if( rsi1 <= 34.0325 )
									ret := 0.388889
								if( rsi1 > 34.0325 )
									ret := -0.457447
							if( VIM > 1.45595 )
								if( k <= 0.488698 )
									ret := 0.809524 // buy
								if( k > 0.488698 )
									ret := 0.207317
						if( smoothD_d > -1.4108 )
							if( VIM <= 0.973251 )
								if( rsi1 <= 36.515 )
									ret := 1.000000 // buy
								if( rsi1 > 36.515 )
									ret := 0.666667
							if( VIM > 0.973251 )
								if( smoothK_k <= 8.44466 )
									ret := 0.199896
								if( smoothK_k > 8.44466 )
									ret := 0.059226
				if( d > 10.3487 )
					if( VIM <= 1.48384 )
						if( d_k <= 24.2033 )
							if( VIP_VIM <= -0.41549 )
								if( d_k <= -3.91702 )
									ret := 0.525000
								if( d_k > -3.91702 )
									ret := 0.169014
							if( VIP_VIM > -0.41549 )
								if( smoothK_k <= 23.3337 )
									ret := 0.161483
								if( smoothK_k > 23.3337 )
									ret := 0.082839
						if( d_k > 24.2033 )
							if( d_k <= 30.4046 )
								if( d <= 78.4429 )
									ret := -0.221014
								if( d > 78.4429 )
									ret := 1.000000 // buy
							if( d_k > 30.4046 )
								if( smoothK_k <= 7.60756 )
									ret := -0.285714
								if( smoothK_k > 7.60756 )
									ret := 0.512195
					if( VIM > 1.48384 )
						if( d <= 97.4834 )
							if( smoothK_k <= 83.8397 )
								if( smoothK_k <= 77.4975 )
									ret := 0.039319
								if( smoothK_k > 77.4975 )
									ret := 0.346939
							if( smoothK_k > 83.8397 )
								if( smoothK_k <= 95.765 )
									ret := -0.282051
								if( smoothK_k > 95.765 )
									ret := 0.411765
						if( d > 97.4834 )
							if( VIP_VIM <= -0.545256 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.545256 )
								ret := 0.000000
	if( rsi1 > 43.1467 )
		if( d_k <= 0.675244 )
			if( rsi1 <= 63.4465 )
				if( VIP <= 0.885364 )
					if( d <= 2.89751 )
						if( smoothD_d <= -0.612321 )
							ret := 0.500000
						if( smoothD_d > -0.612321 )
							ret := 1.000000 // buy
					if( d > 2.89751 )
						if( rsi1 <= 43.7754 )
							if( VIP_VIM <= -0.168059 )
								if( rsi1 <= 43.248 )
									ret := -0.318182
								if( rsi1 > 43.248 )
									ret := 0.203390
							if( VIP_VIM > -0.168059 )
								ret := -1.000000 // sell
						if( rsi1 > 43.7754 )
							if( d_k <= -20.3008 )
								if( VIM <= 1.02897 )
									ret := 0.818182 // buy
								if( VIM > 1.02897 )
									ret := 0.000000
							if( d_k > -20.3008 )
								if( rsi1 <= 46.8871 )
									ret := -0.224138
								if( rsi1 > 46.8871 )
									ret := -0.455782
				if( VIP > 0.885364 )
					if( smoothK_k <= 8.51409 )
						if( k <= 9.94674 )
							if( VIP_VIM <= -0.133731 )
								if( VIM <= 1.05132 )
									ret := 0.700000 // buy
								if( VIM > 1.05132 )
									ret := -0.239865
							if( VIP_VIM > -0.133731 )
								if( rsi1 <= 47.5238 )
									ret := 0.167095
								if( rsi1 > 47.5238 )
									ret := -0.009292
						if( k > 9.94674 )
							if( d <= 5.27656 )
								if( rsi1 <= 48.3657 )
									ret := -0.466667
								if( rsi1 > 48.3657 )
									ret := 0.350000
							if( d > 5.27656 )
								if( smoothD_d <= 3.10557 )
									ret := -0.719298 // sell
								if( smoothD_d > 3.10557 )
									ret := -0.333333
					if( smoothK_k > 8.51409 )
						if( VIM <= 0.77283 )
							if( VIP_VIM <= 0.65648 )
								if( d_k <= -6.79141 )
									ret := -0.393939
								if( d_k > -6.79141 )
									ret := -0.851852 // sell
							if( VIP_VIM > 0.65648 )
								if( VIP_VIM <= 1.08532 )
									ret := 0.000000
								if( VIP_VIM > 1.08532 )
									ret := 0.750000 // buy
						if( VIM > 0.77283 )
							if( smoothD_d <= 2.8817 )
								if( smoothK_k <= 8.75876 )
									ret := -0.181818
								if( smoothK_k > 8.75876 )
									ret := 0.394495
							if( smoothD_d > 2.8817 )
								if( smoothD_d <= 96.9763 )
									ret := 0.037925
								if( smoothD_d > 96.9763 )
									ret := -0.227273
			if( rsi1 > 63.4465 )
				if( smoothD_d <= 15.6805 )
					if( d_k <= -1.58133 )
						if( VIP_VIM <= 0.433351 )
							if( d <= 16.8499 )
								if( smoothD_d <= 3.17328 )
									ret := 0.250000
								if( smoothD_d > 3.17328 )
									ret := -0.200000
							if( d > 16.8499 )
								if( k <= 23.0621 )
									ret := -0.714286 // sell
								if( k > 23.0621 )
									ret := 0.527778
						if( VIP_VIM > 0.433351 )
							if( rsi1 <= 79.2736 )
								if( VIP <= 1.23399 )
									ret := 0.666667
								if( VIP > 1.23399 )
									ret := 0.147059
							if( rsi1 > 79.2736 )
								if( smoothD_d <= 8.17971 )
									ret := 0.750000 // buy
								if( smoothD_d > 8.17971 )
									ret := 1.000000 // buy
					if( d_k > -1.58133 )
						if( d <= 16.2196 )
							if( VIM <= 0.848697 )
								if( VIP_VIM <= 0.428491 )
									ret := -0.227273
								if( VIP_VIM > 0.428491 )
									ret := 0.411765
							if( VIM > 0.848697 )
								if( VIP_VIM <= 0.771276 )
									ret := 0.657895
								if( VIP_VIM > 0.771276 )
									ret := -0.400000
						if( d > 16.2196 )
							if( VIP_VIM <= 0.297178 )
								ret := 0.500000
							if( VIP_VIM > 0.297178 )
								ret := 1.000000 // buy
				if( smoothD_d > 15.6805 )
					if( VIP <= 1.29005 )
						if( smoothK_k <= 67.492 )
							if( VIP_VIM <= 0.2231 )
								if( smoothD_d <= 25.8526 )
									ret := -0.042857
								if( smoothD_d > 25.8526 )
									ret := -0.449198
							if( VIP_VIM > 0.2231 )
								if( d_k <= -11.3287 )
									ret := 0.069583
								if( d_k > -11.3287 )
									ret := -0.146096
						if( smoothK_k > 67.492 )
							if( smoothK_k <= 78.5994 )
								if( smoothK_k <= 76.9592 )
									ret := 0.045706
								if( smoothK_k > 76.9592 )
									ret := 0.374302
							if( smoothK_k > 78.5994 )
								if( k <= 99.2618 )
									ret := -0.029439
								if( k > 99.2618 )
									ret := 0.076051
					if( VIP > 1.29005 )
						if( VIP_VIM <= 1.29403 )
							if( d_k <= -1.3587 )
								if( smoothD_d <= 23.5395 )
									ret := -0.406977
								if( smoothD_d > 23.5395 )
									ret := -0.030998
							if( d_k > -1.3587 )
								if( VIP_VIM <= 0.941787 )
									ret := -0.167055
								if( VIP_VIM > 0.941787 )
									ret := 0.080745
						if( VIP_VIM > 1.29403 )
							if( smoothK_k <= 83.3555 )
								if( k <= 85.937 )
									ret := -0.057471
								if( k > 85.937 )
									ret := 0.750000 // buy
							if( smoothK_k > 83.3555 )
								if( VIP <= 4.76889 )
									ret := -0.377551
								if( VIP > 4.76889 )
									ret := -0.059701
		if( d_k > 0.675244 )
			if( VIP_VIM <= -0.041503 )
				if( k <= 88.22 )
					if( VIM <= 1.01359 )
						if( d_k <= 12.965 )
							if( smoothK_k <= 83.1698 )
								if( smoothK_k <= 81.7094 )
									ret := -0.384615
								if( smoothK_k > 81.7094 )
									ret := -0.909091 // sell
							if( smoothK_k > 83.1698 )
								ret := 0.500000
						if( d_k > 12.965 )
							if( d_k <= 15.258 )
								if( rsi1 <= 46.488 )
									ret := 0.750000 // buy
								if( rsi1 > 46.488 )
									ret := -0.285714
							if( d_k > 15.258 )
								if( d_k <= 20.7866 )
									ret := -0.358974
								if( d_k > 20.7866 )
									ret := 0.166667
					if( VIM > 1.01359 )
						if( d_k <= 5.2715 )
							if( k <= 5.17463 )
								if( VIP <= 0.997217 )
									ret := 0.375000
								if( VIP > 0.997217 )
									ret := 0.024096
							if( k > 5.17463 )
								if( VIM <= 1.01849 )
									ret := -0.423077
								if( VIM > 1.01849 )
									ret := 0.053983
						if( d_k > 5.2715 )
							if( smoothD_d <= 5.27802 )
								if( VIP_VIM <= -0.257713 )
									ret := 0.000000
								if( VIP_VIM > -0.257713 )
									ret := -0.702128 // sell
							if( smoothD_d > 5.27802 )
								if( rsi1 <= 53.0541 )
									ret := -0.046996
								if( rsi1 > 53.0541 )
									ret := 0.168317
				if( k > 88.22 )
					if( rsi1 <= 49.8557 )
						if( rsi1 <= 45.7734 )
							if( VIP <= 0.955372 )
								if( smoothD_d <= 91.8799 )
									ret := -0.062500
								if( smoothD_d > 91.8799 )
									ret := 0.750000 // buy
							if( VIP > 0.955372 )
								if( smoothK_k <= 92.0531 )
									ret := -0.050000
								if( smoothK_k > 92.0531 )
									ret := -0.875000 // sell
						if( rsi1 > 45.7734 )
							if( k <= 93.1506 )
								if( smoothK_k <= 85.9628 )
									ret := -0.076923
								if( smoothK_k > 85.9628 )
									ret := -0.783784 // sell
							if( k > 93.1506 )
								if( d <= 95.4906 )
									ret := 0.777778 // buy
								if( d > 95.4906 )
									ret := -0.562500
					if( rsi1 > 49.8557 )
						if( rsi1 <= 56.9763 )
							if( VIM <= 1.04413 )
								if( VIP <= 0.979706 )
									ret := -0.909091 // sell
								if( VIP > 0.979706 )
									ret := 0.250000
							if( VIM > 1.04413 )
								if( VIM <= 3.60194 )
									ret := 0.421053
								if( VIM > 3.60194 )
									ret := -0.307692
						if( rsi1 > 56.9763 )
							if( rsi1 <= 60.2656 )
								if( VIP <= 2.36028 )
									ret := -0.852941 // sell
								if( VIP > 2.36028 )
									ret := -0.444444
							if( rsi1 > 60.2656 )
								if( smoothK_k <= 95.0471 )
									ret := -0.081081
								if( smoothK_k > 95.0471 )
									ret := 0.800000 // buy
			if( VIP_VIM > -0.041503 )
				if( d <= 10.636 )
					if( VIM <= 1.0601 )
						if( rsi1 <= 72.3969 )
							if( VIM <= 0.948815 )
								if( VIM <= 0.916433 )
									ret := 0.266949
								if( VIM > 0.916433 )
									ret := -0.090164
							if( VIM > 0.948815 )
								if( smoothK_k <= 1.81712 )
									ret := 0.328395
								if( smoothK_k > 1.81712 )
									ret := 0.633333
						if( rsi1 > 72.3969 )
							ret := 1.000000 // buy
					if( VIM > 1.0601 )
						if( smoothK_k <= 1.80481 )
							if( rsi1 <= 46.8109 )
								if( d_k <= 3.33162 )
									ret := -0.206897
								if( d_k > 3.33162 )
									ret := 0.470588
							if( rsi1 > 46.8109 )
								if( k <= 0.005171 )
									ret := 0.050000
								if( k > 0.005171 )
									ret := -0.314286
						if( smoothK_k > 1.80481 )
							if( d_k <= 1.92107 )
								if( rsi1 <= 45.9596 )
									ret := -0.500000
								if( rsi1 > 45.9596 )
									ret := 0.185185
							if( d_k > 1.92107 )
								if( k <= 7.18664 )
									ret := 0.400000
								if( k > 7.18664 )
									ret := 1.000000 // buy
				if( d > 10.636 )
					if( d_k <= 29.8664 )
						if( VIP <= 0.949009 )
							if( smoothK_k <= 57.3852 )
								if( VIP_VIM <= -0.02164 )
									ret := 0.300000
								if( VIP_VIM > -0.02164 )
									ret := -0.432432
							if( smoothK_k > 57.3852 )
								if( VIP <= 0.943601 )
									ret := -0.823529 // sell
								if( VIP > 0.943601 )
									ret := 0.000000
						if( VIP > 0.949009 )
							if( smoothD_d <= 64.7623 )
								if( rsi1 <= 52.6237 )
									ret := 0.074876
								if( rsi1 > 52.6237 )
									ret := -0.000914
							if( smoothD_d > 64.7623 )
								if( d <= 70.0281 )
									ret := 0.207574
								if( d > 70.0281 )
									ret := 0.069299
					if( d_k > 29.8664 )
						if( VIP <= 1.83012 )
							if( smoothK_k <= 24.7784 )
								if( d <= 32.0843 )
									ret := 0.875000 // buy
								if( d > 32.0843 )
									ret := 0.125000
							if( smoothK_k > 24.7784 )
								if( VIP <= 1.14845 )
									ret := 0.718750 // buy
								if( VIP > 1.14845 )
									ret := 0.117647
						if( VIP > 1.83012 )
							if( k <= 25.8487 )
								if( VIM <= 2.04691 )
									ret := 1.000000 // buy
								if( VIM > 2.04691 )
									ret := 0.636364
							if( k > 25.8487 )
								ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AAPL_1Min_d85d2465(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


