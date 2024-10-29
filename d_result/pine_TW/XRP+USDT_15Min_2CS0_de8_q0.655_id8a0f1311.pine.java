//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: XRPUSDT_15Min_2CS0_8a0f1311 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2CS0_8a0f1311", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_8a0f1311(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothD_d <= 44.7369 )
		if( rsi1 <= 45.7591 )
			if( k <= 22.3789 )
				if( rsi1 <= 30.8321 )
					if( mf <= -0.097427 )
						if( ad_mf <= -4.24037e+06 )
							if( mf <= -0.402338 )
								ret := -1.000000 // sell
							if( mf > -0.402338 )
								if( d_k <= 1.8866 )
									ret := -0.317365
								if( d_k > 1.8866 )
									ret := 0.223529
						if( ad_mf > -4.24037e+06 )
							if( ad_mf <= 2.5687e+06 )
								if( mf <= -0.324098 )
									ret := 0.302326
								if( mf > -0.324098 )
									ret := -0.335754
							if( ad_mf > 2.5687e+06 )
								if( rsi1 <= 18.6699 )
									ret := 0.538462
								if( rsi1 > 18.6699 )
									ret := -0.128571
					if( mf > -0.097427 )
						if( mf <= -0.0299 )
							if( d_k <= 6.92024 )
								if( d_k <= -2.18297 )
									ret := -0.600000
								if( d_k > -2.18297 )
									ret := -0.433457
							if( d_k > 6.92024 )
								if( d_k <= 20.8322 )
									ret := -0.598071
								if( d_k > 20.8322 )
									ret := -0.851852 // sell
						if( mf > -0.0299 )
							if( d_k <= 16.9876 )
								if( ad_mf <= 1.50305e+07 )
									ret := -0.626892
								if( ad_mf > 1.50305e+07 )
									ret := 0.571429
							if( d_k > 16.9876 )
								if( d_k <= 19.275 )
									ret := -0.239437
								if( d_k > 19.275 )
									ret := -0.544776
				if( rsi1 > 30.8321 )
					if( mf <= -0.045527 )
						if( d_k <= -2.65058 )
							if( mf <= -0.098397 )
								if( d_k <= -2.93181 )
									ret := -0.140244
								if( d_k > -2.93181 )
									ret := -0.652174
							if( mf > -0.098397 )
								if( ad_mf <= -4.74283e+06 )
									ret := -0.840909 // sell
								if( ad_mf > -4.74283e+06 )
									ret := -0.365482
						if( d_k > -2.65058 )
							if( ad_mf <= -6.56264e+06 )
								if( k <= 14.201 )
									ret := -0.071429
								if( k > 14.201 )
									ret := 0.608696
							if( ad_mf > -6.56264e+06 )
								if( mf <= -0.126126 )
									ret := -0.059685
								if( mf > -0.126126 )
									ret := -0.208633
					if( mf > -0.045527 )
						if( mf <= 0.049147 )
							if( ad_mf <= 6.73587e+06 )
								if( d <= 13.8473 )
									ret := -0.419985
								if( d > 13.8473 )
									ret := -0.309073
							if( ad_mf > 6.73587e+06 )
								if( k <= 7.95594 )
									ret := -0.750000 // sell
								if( k > 7.95594 )
									ret := 0.282051
						if( mf > 0.049147 )
							if( d_k <= 2.23682 )
								if( ad <= 891743 )
									ret := -0.482182
								if( ad > 891743 )
									ret := -0.588764
							if( d_k > 2.23682 )
								if( ad <= 530695 )
									ret := -0.351320
								if( ad > 530695 )
									ret := -0.539985
			if( k > 22.3789 )
				if( ad <= -2.90775e+06 )
					if( mf <= -0.024133 )
						if( k <= 28.8234 )
							if( rsi1 <= 24.2214 )
								if( ad <= -5.47818e+06 )
									ret := -0.333333
								if( ad > -5.47818e+06 )
									ret := -0.709677 // sell
							if( rsi1 > 24.2214 )
								if( mf <= -0.093048 )
									ret := 0.318584
								if( mf > -0.093048 )
									ret := -0.234899
						if( k > 28.8234 )
							if( ad_mf <= -5.4545e+06 )
								if( smoothD_d <= 41.134 )
									ret := 0.477322
								if( smoothD_d > 41.134 )
									ret := 0.097826
							if( ad_mf > -5.4545e+06 )
								if( d_k <= -13.0499 )
									ret := -0.170732
								if( d_k > -13.0499 )
									ret := 0.289362
					if( mf > -0.024133 )
						if( k <= 46.4979 )
							if( ad_mf <= -1.80045e+07 )
								ret := 1.000000 // buy
							if( ad_mf > -1.80045e+07 )
								if( smoothK_k <= 22.2926 )
									ret := 0.082645
								if( smoothK_k > 22.2926 )
									ret := -0.313609
						if( k > 46.4979 )
							if( smoothD_d <= 42.0881 )
								if( smoothD_d <= 39.438 )
									ret := 0.411765
								if( smoothD_d > 39.438 )
									ret := 0.000000
							if( smoothD_d > 42.0881 )
								ret := 0.631579
				if( ad > -2.90775e+06 )
					if( rsi1 <= 38.8807 )
						if( k <= 37.7351 )
							if( d_k <= -14.8808 )
								if( ad <= 2.86455e+06 )
									ret := -0.576923
								if( ad > 2.86455e+06 )
									ret := -0.931034 // sell
							if( d_k > -14.8808 )
								if( mf <= -0.078053 )
									ret := -0.199203
								if( mf > -0.078053 )
									ret := -0.448435
						if( k > 37.7351 )
							if( ad <= 9.07005e+06 )
								if( smoothK_k <= 57.3765 )
									ret := -0.312570
								if( smoothK_k > 57.3765 )
									ret := -0.051724
							if( ad > 9.07005e+06 )
								if( ad <= 9.8094e+06 )
									ret := 1.000000 // buy
								if( ad > 9.8094e+06 )
									ret := 0.321429
					if( rsi1 > 38.8807 )
						if( k <= 49.3451 )
							if( mf <= 0.05666 )
								if( ad_mf <= 9.33407e+06 )
									ret := -0.130911
								if( ad_mf > 9.33407e+06 )
									ret := 0.724138 // buy
							if( mf > 0.05666 )
								if( ad <= 1.23505e+07 )
									ret := -0.427095
								if( ad > 1.23505e+07 )
									ret := 0.437500
						if( k > 49.3451 )
							if( mf <= 0.012783 )
								if( ad_mf <= 5.42543e+06 )
									ret := 0.048346
								if( ad_mf > 5.42543e+06 )
									ret := 0.777778 // buy
							if( mf > 0.012783 )
								if( d_k <= -23.2459 )
									ret := 0.600000
								if( d_k > -23.2459 )
									ret := -0.239234
		if( rsi1 > 45.7591 )
			if( smoothD_d <= 21.1181 )
				if( ad <= 838650 )
					if( k <= 25.2819 )
						if( rsi1 <= 54.9458 )
							if( mf <= -0.023791 )
								if( ad <= -817228 )
									ret := 0.128492
								if( ad > -817228 )
									ret := -0.176667
							if( mf > -0.023791 )
								if( k <= 10.1134 )
									ret := -0.148876
								if( k > 10.1134 )
									ret := -0.274086
						if( rsi1 > 54.9458 )
							if( ad <= -3.95441e+06 )
								if( d_k <= -3.17972 )
									ret := 0.076923
								if( d_k > -3.17972 )
									ret := -0.475410
							if( ad > -3.95441e+06 )
								if( ad <= -2.61094e+06 )
									ret := 0.394231
								if( ad > -2.61094e+06 )
									ret := -0.026437
					if( k > 25.2819 )
						if( mf <= 0.0039 )
							if( ad <= -905725 )
								if( d_k <= -14.9566 )
									ret := -0.406250
								if( d_k > -14.9566 )
									ret := 0.180328
							if( ad > -905725 )
								if( d <= 21.617 )
									ret := -0.114583
								if( d > 21.617 )
									ret := -0.465517
						if( mf > 0.0039 )
							if( ad <= -1.52021e+06 )
								if( smoothK_k <= 36.2575 )
									ret := 0.431818
								if( smoothK_k > 36.2575 )
									ret := -0.363636
							if( ad > -1.52021e+06 )
								if( smoothK_k <= 22.5886 )
									ret := 0.692308
								if( smoothK_k > 22.5886 )
									ret := 0.022535
				if( ad > 838650 )
					if( smoothK_k <= 12.9404 )
						if( k <= 14.9946 )
							if( mf <= 0.010385 )
								if( d <= 21.4163 )
									ret := -0.052083
								if( d > 21.4163 )
									ret := -0.692308
							if( mf > 0.010385 )
								if( rsi1 <= 49.6368 )
									ret := -0.556373
								if( rsi1 > 49.6368 )
									ret := -0.336597
						if( k > 14.9946 )
							if( d_k <= -6.50692 )
								ret := -0.944444 // sell
							if( d_k > -6.50692 )
								if( d_k <= 2.57379 )
									ret := -0.400000
								if( d_k > 2.57379 )
									ret := -0.684211
					if( smoothK_k > 12.9404 )
						if( ad_mf <= 3.62829e+06 )
							if( rsi1 <= 51.806 )
								if( smoothD_d <= 12.3155 )
									ret := -0.169231
								if( smoothD_d > 12.3155 )
									ret := -0.386517
							if( rsi1 > 51.806 )
								if( d_k <= -6.20751 )
									ret := -0.074176
								if( d_k > -6.20751 )
									ret := -0.285141
						if( ad_mf > 3.62829e+06 )
							if( ad <= 4.62599e+06 )
								if( d <= 13.0732 )
									ret := 0.925926 // buy
								if( d > 13.0732 )
									ret := 0.191489
							if( ad > 4.62599e+06 )
								if( ad <= 7.953e+06 )
									ret := -0.376812
								if( ad > 7.953e+06 )
									ret := 0.105263
			if( smoothD_d > 21.1181 )
				if( k <= 38.7609 )
					if( ad_mf <= -533986 )
						if( d <= 26.0271 )
							if( smoothD_d <= 22.9361 )
								if( ad_mf <= -5.81259e+06 )
									ret := 0.714286 // buy
								if( ad_mf > -5.81259e+06 )
									ret := 0.262712
							if( smoothD_d > 22.9361 )
								ret := 0.764706 // buy
						if( d > 26.0271 )
							if( mf <= 0.046943 )
								if( d <= 36.0867 )
									ret := 0.261168
								if( d > 36.0867 )
									ret := 0.045558
							if( mf > 0.046943 )
								if( ad <= -7.54308e+06 )
									ret := -0.490909
								if( ad > -7.54308e+06 )
									ret := -0.073783
					if( ad_mf > -533986 )
						if( mf <= 0.164945 )
							if( d <= 25.6005 )
								if( smoothD_d <= 22.1711 )
									ret := 0.027523
								if( smoothD_d > 22.1711 )
									ret := 0.447368
							if( d > 25.6005 )
								if( d <= 26.5294 )
									ret := -0.264368
								if( d > 26.5294 )
									ret := -0.074832
						if( mf > 0.164945 )
							if( ad <= -496515 )
								ret := -1.000000 // sell
							if( ad > -496515 )
								if( ad_mf <= -271930 )
									ret := 0.294118
								if( ad_mf > -271930 )
									ret := -0.233909
				if( k > 38.7609 )
					if( ad <= -415735 )
						if( ad <= -3.08065e+06 )
							if( ad <= -4.88886e+06 )
								if( rsi1 <= 48.2159 )
									ret := -0.111111
								if( rsi1 > 48.2159 )
									ret := 0.362903
							if( ad > -4.88886e+06 )
								if( rsi1 <= 63.0957 )
									ret := 0.480000
								if( rsi1 > 63.0957 )
									ret := 0.864865 // buy
						if( ad > -3.08065e+06 )
							if( rsi1 <= 52.4919 )
								if( mf <= 0.030274 )
									ret := 0.262019
								if( mf > 0.030274 )
									ret := -0.034247
							if( rsi1 > 52.4919 )
								if( smoothK_k <= 55.9713 )
									ret := 0.402353
								if( smoothK_k > 55.9713 )
									ret := 0.261111
					if( ad > -415735 )
						if( rsi1 <= 52.4085 )
							if( d_k <= -2.77876 )
								if( ad <= 3.59015e+06 )
									ret := -0.046046
								if( ad > 3.59015e+06 )
									ret := 0.303226
							if( d_k > -2.77876 )
								if( ad_mf <= 2.37161e+06 )
									ret := -0.123967
								if( ad_mf > 2.37161e+06 )
									ret := -0.505618
						if( rsi1 > 52.4085 )
							if( ad <= 5.5798e+06 )
								if( smoothD_d <= 35.6897 )
									ret := 0.024249
								if( smoothD_d > 35.6897 )
									ret := 0.143519
							if( ad > 5.5798e+06 )
								if( ad <= 1.78951e+07 )
									ret := -0.236000
								if( ad > 1.78951e+07 )
									ret := 0.583333
	if( smoothD_d > 44.7369 )
		if( smoothK_k <= 66.2709 )
			if( k <= 53.0349 )
				if( rsi1 <= 43.581 )
					if( mf <= 0.076955 )
						if( ad <= -4.48724e+06 )
							if( ad_mf <= -4.64271e+06 )
								if( k <= 33.0076 )
									ret := -0.392857
								if( k > 33.0076 )
									ret := 0.253247
							if( ad_mf > -4.64271e+06 )
								ret := 1.000000 // buy
						if( ad > -4.48724e+06 )
							if( k <= 43.9182 )
								if( d_k <= 12.9138 )
									ret := -0.522293
								if( d_k > 12.9138 )
									ret := -0.238516
							if( k > 43.9182 )
								if( rsi1 <= 40.4568 )
									ret := -0.212733
								if( rsi1 > 40.4568 )
									ret := 0.054608
					if( mf > 0.076955 )
						if( d_k <= 10.6516 )
							if( smoothK_k <= 46.9358 )
								if( ad <= 1.81157e+06 )
									ret := -0.344828
								if( ad > 1.81157e+06 )
									ret := -0.783784 // sell
							if( smoothK_k > 46.9358 )
								if( mf <= 0.132144 )
									ret := -0.903226 // sell
								if( mf > 0.132144 )
									ret := -0.615385
						if( d_k > 10.6516 )
							if( d <= 50.1919 )
								if( mf <= 0.113885 )
									ret := 0.000000
								if( mf > 0.113885 )
									ret := -0.800000 // sell
							if( d > 50.1919 )
								if( ad_mf <= 497856 )
									ret := -0.019481
								if( ad_mf > 497856 )
									ret := -0.393258
				if( rsi1 > 43.581 )
					if( ad <= 1.30814e+06 )
						if( ad <= 1.29779e+06 )
							if( rsi1 <= 59.8403 )
								if( d <= 48.1877 )
									ret := 0.318841
								if( d > 48.1877 )
									ret := 0.009121
							if( rsi1 > 59.8403 )
								if( k <= 34.9342 )
									ret := 0.416667
								if( k > 34.9342 )
									ret := 0.176667
						if( ad > 1.29779e+06 )
							ret := 1.000000 // buy
					if( ad > 1.30814e+06 )
						if( smoothD_d <= 47.3904 )
							if( smoothD_d <= 46.801 )
								if( rsi1 <= 55.1079 )
									ret := -0.367470
								if( rsi1 > 55.1079 )
									ret := 0.081395
							if( smoothD_d > 46.801 )
								if( smoothD_d <= 47.2713 )
									ret := -0.500000
								if( smoothD_d > 47.2713 )
									ret := -0.888889 // sell
						if( smoothD_d > 47.3904 )
							if( ad_mf <= 1.32155e+06 )
								ret := -0.933333 // sell
							if( ad_mf > 1.32155e+06 )
								if( rsi1 <= 66.6823 )
									ret := -0.086314
								if( rsi1 > 66.6823 )
									ret := 0.319588
			if( k > 53.0349 )
				if( d <= 58.7752 )
					if( ad_mf <= -3.02246e+06 )
						if( k <= 53.9956 )
							if( d_k <= -0.466041 )
								ret := 0.454545
							if( d_k > -0.466041 )
								if( ad <= -4.68021e+06 )
									ret := -0.357143
								if( ad > -4.68021e+06 )
									ret := -0.888889 // sell
						if( k > 53.9956 )
							if( mf <= -0.143627 )
								if( k <= 60.5807 )
									ret := 0.903846 // buy
								if( k > 60.5807 )
									ret := 0.591837
							if( mf > -0.143627 )
								if( mf <= -0.10404 )
									ret := -0.275862
								if( mf > -0.10404 )
									ret := 0.381089
					if( ad_mf > -3.02246e+06 )
						if( rsi1 <= 50.4058 )
							if( smoothK_k <= 64.7646 )
								if( ad_mf <= 5.62433e+06 )
									ret := -0.076331
								if( ad_mf > 5.62433e+06 )
									ret := 0.418367
							if( smoothK_k > 64.7646 )
								if( ad_mf <= -1.24246e+06 )
									ret := 0.842105 // buy
								if( ad_mf > -1.24246e+06 )
									ret := 0.341463
						if( rsi1 > 50.4058 )
							if( k <= 59.9095 )
								if( mf <= 0.13432 )
									ret := 0.289024
								if( mf > 0.13432 )
									ret := -0.085911
							if( k > 59.9095 )
								if( smoothK_k <= 62.4266 )
									ret := 0.410294
								if( smoothK_k > 62.4266 )
									ret := 0.223837
				if( d > 58.7752 )
					if( rsi1 <= 49.022 )
						if( d_k <= 2.54194 )
							if( ad <= -2.408e+06 )
								if( k <= 65.221 )
									ret := 0.474227
								if( k > 65.221 )
									ret := 0.118421
							if( ad > -2.408e+06 )
								if( rsi1 <= 46.0365 )
									ret := -0.134653
								if( rsi1 > 46.0365 )
									ret := 0.203593
						if( d_k > 2.54194 )
							if( ad_mf <= 644969 )
								if( mf <= 0.053476 )
									ret := 0.022099
								if( mf > 0.053476 )
									ret := -0.254980
							if( ad_mf > 644969 )
								if( k <= 66.9871 )
									ret := -0.243740
								if( k > 66.9871 )
									ret := -0.569444
					if( rsi1 > 49.022 )
						if( smoothD_d <= 69.6816 )
							if( mf <= 0.224372 )
								if( mf <= 0.039176 )
									ret := 0.222672
								if( mf > 0.039176 )
									ret := 0.059370
							if( mf > 0.224372 )
								if( ad_mf <= 6.71437e+06 )
									ret := -0.090535
								if( ad_mf > 6.71437e+06 )
									ret := -0.758242 // sell
						if( smoothD_d > 69.6816 )
							if( ad_mf <= 7.77952e+06 )
								if( k <= 60.947 )
									ret := 0.384000
								if( k > 60.947 )
									ret := 0.222149
							if( ad_mf > 7.77952e+06 )
								if( d_k <= 7.95898 )
									ret := 0.357143
								if( d_k > 7.95898 )
									ret := -0.552632
		if( smoothK_k > 66.2709 )
			if( rsi1 <= 51.1657 )
				if( smoothK_k <= 74.7601 )
					if( k <= 77.6944 )
						if( ad_mf <= -706338 )
							if( ad <= -8.63052e+06 )
								if( rsi1 <= 36.8945 )
									ret := 0.956522 // buy
								if( rsi1 > 36.8945 )
									ret := 0.571429
							if( ad > -8.63052e+06 )
								if( smoothD_d <= 71.2077 )
									ret := 0.272374
								if( smoothD_d > 71.2077 )
									ret := 0.021231
						if( ad_mf > -706338 )
							if( ad_mf <= 7.26063e+06 )
								if( smoothD_d <= 77.6501 )
									ret := -0.097507
								if( smoothD_d > 77.6501 )
									ret := 0.127946
							if( ad_mf > 7.26063e+06 )
								if( ad_mf <= 8.75743e+06 )
									ret := 0.882353 // buy
								if( ad_mf > 8.75743e+06 )
									ret := 0.370370
					if( k > 77.6944 )
						ret := -0.600000
				if( smoothK_k > 74.7601 )
					if( ad <= -3.92662e+06 )
						if( ad_mf <= -7.65032e+06 )
							if( ad <= -1.96766e+07 )
								ret := 1.000000 // buy
							if( ad > -1.96766e+07 )
								if( ad_mf <= -1.57631e+07 )
									ret := 0.000000
								if( ad_mf > -1.57631e+07 )
									ret := 0.831776 // buy
						if( ad_mf > -7.65032e+06 )
							if( smoothD_d <= 73.0912 )
								if( ad_mf <= -5.11424e+06 )
									ret := 0.538462
								if( ad_mf > -5.11424e+06 )
									ret := 1.000000 // buy
							if( smoothD_d > 73.0912 )
								if( ad_mf <= -6.53087e+06 )
									ret := 0.021739
								if( ad_mf > -6.53087e+06 )
									ret := 0.458564
					if( ad > -3.92662e+06 )
						if( ad <= 7.08639e+06 )
							if( mf <= 0.080513 )
								if( ad <= -3.84158e+06 )
									ret := -0.619048
								if( ad > -3.84158e+06 )
									ret := 0.144964
							if( mf > 0.080513 )
								if( smoothK_k <= 94.5796 )
									ret := 0.041009
								if( smoothK_k > 94.5796 )
									ret := -0.381818
						if( ad > 7.08639e+06 )
							if( d <= 64.4858 )
								ret := -0.461538
							if( d > 64.4858 )
								if( rsi1 <= 35.0272 )
									ret := 0.153846
								if( rsi1 > 35.0272 )
									ret := 0.723926 // buy
			if( rsi1 > 51.1657 )
				if( ad_mf <= -977500 )
					if( ad_mf <= -1.5244e+07 )
						if( ad_mf <= -2.04706e+07 )
							if( mf <= 0.129657 )
								if( d_k <= -7.70582 )
									ret := -0.538462
								if( d_k > -7.70582 )
									ret := 0.925926 // buy
							if( mf > 0.129657 )
								ret := -0.368421
						if( ad_mf > -2.04706e+07 )
							if( ad_mf <= -1.80233e+07 )
								if( d <= 81.7284 )
									ret := -1.000000 // sell
								if( d > 81.7284 )
									ret := -0.818182 // sell
							if( ad_mf > -1.80233e+07 )
								if( k <= 82.5932 )
									ret := 0.000000
								if( k > 82.5932 )
									ret := -0.636364
					if( ad_mf > -1.5244e+07 )
						if( d_k <= 3.03034 )
							if( mf <= 0.091561 )
								if( rsi1 <= 64.7504 )
									ret := 0.483653
								if( rsi1 > 64.7504 )
									ret := 0.624767
							if( mf > 0.091561 )
								if( rsi1 <= 74.3125 )
									ret := 0.266368
								if( rsi1 > 74.3125 )
									ret := 0.628647
						if( d_k > 3.03034 )
							if( ad <= -9.12952e+06 )
								if( d_k <= 8.10393 )
									ret := 0.406250
								if( d_k > 8.10393 )
									ret := -0.923077 // sell
							if( ad > -9.12952e+06 )
								if( mf <= 0.009379 )
									ret := 0.498542
								if( mf > 0.009379 )
									ret := 0.236316
				if( ad_mf > -977500 )
					if( mf <= 0.241719 )
						if( smoothD_d <= 84.1107 )
							if( rsi1 <= 59.3156 )
								if( rsi1 <= 51.9528 )
									ret := 0.355263
								if( rsi1 > 51.9528 )
									ret := 0.222337
							if( rsi1 > 59.3156 )
								if( ad <= 1.42258e+07 )
									ret := 0.379871
								if( ad > 1.42258e+07 )
									ret := -0.128205
						if( smoothD_d > 84.1107 )
							if( d <= 99.9754 )
								if( k <= 99.9991 )
									ret := 0.423402
								if( k > 99.9991 )
									ret := 0.264672
							if( d > 99.9754 )
								if( ad <= 6.42245e+06 )
									ret := 0.209877
								if( ad > 6.42245e+06 )
									ret := 0.576923
					if( mf > 0.241719 )
						if( rsi1 <= 86.8564 )
							if( rsi1 <= 67.8714 )
								if( rsi1 <= 67.5801 )
									ret := 0.072978
								if( rsi1 > 67.5801 )
									ret := -0.400000
							if( rsi1 > 67.8714 )
								if( k <= 89.1178 )
									ret := 0.287443
								if( k > 89.1178 )
									ret := 0.118952
						if( rsi1 > 86.8564 )
							if( ad_mf <= 2.79887e+07 )
								if( smoothD_d <= 91.5626 )
									ret := 0.428571
								if( smoothD_d > 91.5626 )
									ret := 0.750000 // buy
							if( ad_mf > 2.79887e+07 )
								ret := -0.142857
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_XRPUSDT_15Min_8a0f1311(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


