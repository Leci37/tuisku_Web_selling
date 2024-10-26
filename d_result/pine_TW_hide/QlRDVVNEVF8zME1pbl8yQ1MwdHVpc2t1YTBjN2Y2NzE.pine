//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: BTCUSDT_30Min_2CS0_a0c7f671 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2CS0_a0c7f671", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_a0c7f671(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 32.4556 )
		if( smoothK_k <= 4.7999 )
			if( mf <= 0.13899 )
				if( rsi1 <= 30.1529 )
					if( rsi1 <= 22.6509 )
						if( mf <= -0.154376 )
							if( d_k <= -1.23072 )
								if( smoothK_k <= 0.468645 )
									ret := 0.096774
								if( smoothK_k > 0.468645 )
									ret := -0.516129
							if( d_k > -1.23072 )
								if( mf <= -0.26405 )
									ret := -0.436364
								if( mf > -0.26405 )
									ret := -0.748166 // sell
						if( mf > -0.154376 )
							if( ad_mf <= -1486.44 )
								if( d <= 4.8676 )
									ret := -0.540881
								if( d > 4.8676 )
									ret := -0.851351 // sell
							if( ad_mf > -1486.44 )
								if( d <= 3.4332 )
									ret := -0.889769 // sell
								if( d > 3.4332 )
									ret := -0.822449 // sell
					if( rsi1 > 22.6509 )
						if( d_k <= 1.95761 )
							if( smoothD_d <= 5.58895 )
								if( d_k <= 1.27173 )
									ret := -0.592701
								if( d_k > 1.27173 )
									ret := -0.385027
							if( smoothD_d > 5.58895 )
								ret := 0.400000
						if( d_k > 1.95761 )
							if( k <= 0.003937 )
								if( d <= 26.6756 )
									ret := -0.562791
								if( d > 26.6756 )
									ret := -1.000000 // sell
							if( k > 0.003937 )
								if( mf <= -0.121388 )
									ret := -0.572464
								if( mf > -0.121388 )
									ret := -0.777663 // sell
				if( rsi1 > 30.1529 )
					if( k <= 2.40545 )
						if( rsi1 <= 40.0778 )
							if( mf <= -0.076169 )
								if( d_k <= 3.19005 )
									ret := -0.120370
								if( d_k > 3.19005 )
									ret := -0.516854
							if( mf > -0.076169 )
								if( smoothD_d <= -2.97438 )
									ret := -0.040816
								if( smoothD_d > -2.97438 )
									ret := -0.645783
						if( rsi1 > 40.0778 )
							if( d_k <= 2.54965 )
								if( smoothD_d <= -1.42132 )
									ret := 0.067416
								if( smoothD_d > -1.42132 )
									ret := -0.233871
							if( d_k > 2.54965 )
								if( k <= 0.003443 )
									ret := -0.153846
								if( k > 0.003443 )
									ret := -0.496124
					if( k > 2.40545 )
						if( smoothD_d <= 10.1194 )
							if( ad_mf <= -36.8608 )
								if( smoothD_d <= 0.099398 )
									ret := -0.447917
								if( smoothD_d > 0.099398 )
									ret := -0.194182
							if( ad_mf > -36.8608 )
								if( ad <= 649.362 )
									ret := -0.450797
								if( ad > 649.362 )
									ret := -0.266791
						if( smoothD_d > 10.1194 )
							if( ad <= -533.609 )
								if( d_k <= 10.5328 )
									ret := -0.447368
								if( d_k > 10.5328 )
									ret := -0.748062 // sell
							if( ad > -533.609 )
								if( ad <= -498.529 )
									ret := 0.800000 // buy
								if( ad > -498.529 )
									ret := -0.387727
			if( mf > 0.13899 )
				if( ad <= -519.331 )
					if( d <= 17.8866 )
						if( ad_mf <= -3101.26 )
							if( d <= 10.0194 )
								ret := -0.222222
							if( d > 10.0194 )
								ret := -0.947368 // sell
						if( ad_mf > -3101.26 )
							if( d_k <= -0.708099 )
								if( ad_mf <= -857.827 )
									ret := 0.384615
								if( ad_mf > -857.827 )
									ret := -0.609375
							if( d_k > -0.708099 )
								if( rsi1 <= 52.8203 )
									ret := -0.158470
								if( rsi1 > 52.8203 )
									ret := 0.468085
					if( d > 17.8866 )
						if( smoothD_d <= 22.1799 )
							if( smoothK_k <= -0.492864 )
								ret := 0.090909
							if( smoothK_k > -0.492864 )
								ret := -0.653846
						if( smoothD_d > 22.1799 )
							ret := -1.000000 // sell
				if( ad > -519.331 )
					if( ad <= 1994.64 )
						if( mf <= 0.3254 )
							if( ad_mf <= -427.838 )
								if( rsi1 <= 47.9566 )
									ret := -0.942857 // sell
								if( rsi1 > 47.9566 )
									ret := -0.538462
							if( ad_mf > -427.838 )
								if( rsi1 <= 52.0872 )
									ret := -0.562732
								if( rsi1 > 52.0872 )
									ret := -0.116223
						if( mf > 0.3254 )
							if( d <= 11.3935 )
								if( smoothD_d <= 2.29576 )
									ret := 0.111111
								if( smoothD_d > 2.29576 )
									ret := -0.500000
							if( d > 11.3935 )
								ret := 0.608696
					if( ad > 1994.64 )
						if( mf <= 0.206461 )
							if( ad <= 3885.83 )
								if( smoothK_k <= -2.29634 )
									ret := -0.666667
								if( smoothK_k > -2.29634 )
									ret := -0.983607 // sell
							if( ad > 3885.83 )
								ret := -0.400000
						if( mf > 0.206461 )
							if( ad_mf <= 2701.61 )
								ret := -1.000000 // sell
							if( ad_mf > 2701.61 )
								if( ad_mf <= 5559.59 )
									ret := -0.416667
								if( ad_mf > 5559.59 )
									ret := -0.200000
		if( smoothK_k > 4.7999 )
			if( d_k <= -2.08209 )
				if( rsi1 <= 35.2549 )
					if( ad <= -862.528 )
						if( smoothK_k <= 20.3528 )
							if( rsi1 <= 17.4064 )
								if( ad <= -1058.85 )
									ret := -0.555556
								if( ad > -1058.85 )
									ret := -1.000000 // sell
							if( rsi1 > 17.4064 )
								if( mf <= -0.263521 )
									ret := 0.689655
								if( mf > -0.263521 )
									ret := -0.069583
						if( smoothK_k > 20.3528 )
							if( mf <= 0.07082 )
								if( rsi1 <= 29.1501 )
									ret := 0.333333
								if( rsi1 > 29.1501 )
									ret := 0.632184
							if( mf > 0.07082 )
								ret := -0.500000
					if( ad > -862.528 )
						if( k <= 11.072 )
							if( ad_mf <= 2150.14 )
								if( rsi1 <= 26.8338 )
									ret := -0.783920 // sell
								if( rsi1 > 26.8338 )
									ret := -0.572034
							if( ad_mf > 2150.14 )
								ret := 0.000000
						if( k > 11.072 )
							if( ad_mf <= 3404.51 )
								if( d <= 24.4391 )
									ret := -0.286260
								if( d > 24.4391 )
									ret := -0.704348 // sell
							if( ad_mf > 3404.51 )
								if( mf <= -0.016475 )
									ret := 0.731707 // buy
								if( mf > -0.016475 )
									ret := -0.153846
				if( rsi1 > 35.2549 )
					if( ad <= -483.908 )
						if( mf <= 0.019313 )
							if( d_k <= -5.72851 )
								if( ad <= -2693.01 )
									ret := 0.468468
								if( ad > -2693.01 )
									ret := 0.670103
							if( d_k > -5.72851 )
								if( rsi1 <= 40.7422 )
									ret := 0.267016
								if( rsi1 > 40.7422 )
									ret := 0.567568
						if( mf > 0.019313 )
							if( k <= 10.2648 )
								if( rsi1 <= 46.8433 )
									ret := -0.738095 // sell
								if( rsi1 > 46.8433 )
									ret := 0.375000
							if( k > 10.2648 )
								if( smoothD_d <= 9.80571 )
									ret := 0.435146
								if( smoothD_d > 9.80571 )
									ret := 0.232026
					if( ad > -483.908 )
						if( rsi1 <= 44.3665 )
							if( ad_mf <= 736.536 )
								if( smoothD_d <= 9.89072 )
									ret := -0.280000
								if( smoothD_d > 9.89072 )
									ret := -0.045067
							if( ad_mf > 736.536 )
								if( smoothD_d <= 6.98002 )
									ret := -0.049296
								if( smoothD_d > 6.98002 )
									ret := 0.332130
						if( rsi1 > 44.3665 )
							if( smoothD_d <= 3.36808 )
								if( d_k <= -4.40748 )
									ret := -0.243902
								if( d_k > -4.40748 )
									ret := 0.159574
							if( smoothD_d > 3.36808 )
								if( rsi1 <= 60.4722 )
									ret := 0.144235
								if( rsi1 > 60.4722 )
									ret := 0.465257
			if( d_k > -2.08209 )
				if( smoothD_d <= 32.2644 )
					if( k <= 23.1198 )
						if( mf <= 0.226029 )
							if( d <= 19.9978 )
								if( rsi1 <= 34.5609 )
									ret := -0.524742
								if( rsi1 > 34.5609 )
									ret := -0.071736
							if( d > 19.9978 )
								if( ad_mf <= 162.152 )
									ret := -0.362945
								if( ad_mf > 162.152 )
									ret := -0.509021
						if( mf > 0.226029 )
							if( ad_mf <= 1691.87 )
								if( k <= 13.5488 )
									ret := -0.175355
								if( k > 13.5488 )
									ret := 0.211268
							if( ad_mf > 1691.87 )
								if( ad_mf <= 2198.62 )
									ret := -0.600000
								if( ad_mf > 2198.62 )
									ret := -0.951220 // sell
					if( k > 23.1198 )
						if( d_k <= 7.35866 )
							if( mf <= 0.055068 )
								if( ad_mf <= -833.304 )
									ret := 0.078652
								if( ad_mf > -833.304 )
									ret := -0.336449
							if( mf > 0.055068 )
								if( rsi1 <= 51.1191 )
									ret := -0.276074
								if( rsi1 > 51.1191 )
									ret := 0.517857
						if( d_k > 7.35866 )
							if( rsi1 <= 50.07 )
								if( k <= 23.5106 )
									ret := -0.107143
								if( k > 23.5106 )
									ret := -0.633803
							if( rsi1 > 50.07 )
								if( rsi1 <= 50.6037 )
									ret := 0.636364
								if( rsi1 > 50.6037 )
									ret := -0.079365
				if( smoothD_d > 32.2644 )
					if( rsi1 <= 47.4965 )
						if( ad_mf <= -2843.89 )
							if( mf <= -0.091618 )
								ret := 0.400000
							if( mf > -0.091618 )
								if( rsi1 <= 40.3682 )
									ret := -0.741935 // sell
								if( rsi1 > 40.3682 )
									ret := -0.033333
						if( ad_mf > -2843.89 )
							if( d_k <= 18.9896 )
								if( rsi1 <= 39.7642 )
									ret := -0.693878
								if( rsi1 > 39.7642 )
									ret := -0.420225
							if( d_k > 18.9896 )
								if( ad_mf <= 1468.47 )
									ret := -0.739715 // sell
								if( ad_mf > 1468.47 )
									ret := -0.900826 // sell
					if( rsi1 > 47.4965 )
						if( ad_mf <= 373.864 )
							if( k <= 25.7911 )
								if( rsi1 <= 58.7999 )
									ret := -0.349515
								if( rsi1 > 58.7999 )
									ret := 0.134409
							if( k > 25.7911 )
								if( ad <= -3548.6 )
									ret := -0.705882 // sell
								if( ad > -3548.6 )
									ret := 0.078947
						if( ad_mf > 373.864 )
							if( smoothK_k <= 13.5916 )
								if( smoothD_d <= 34.8583 )
									ret := -0.400000
								if( smoothD_d > 34.8583 )
									ret := 0.551724
							if( smoothK_k > 13.5916 )
								if( ad <= 401.824 )
									ret := -0.875000 // sell
								if( ad > 401.824 )
									ret := -0.323457
	if( k > 32.4556 )
		if( d_k <= 3.21716 )
			if( d <= 94.6151 )
				if( smoothK_k <= 91.8528 )
					if( rsi1 <= 50.351 )
						if( ad_mf <= -1508.71 )
							if( mf <= -0.04392 )
								if( smoothD_d <= 70.826 )
									ret := 0.658854
								if( smoothD_d > 70.826 )
									ret := 0.175000
							if( mf > -0.04392 )
								if( d_k <= -4.30849 )
									ret := 0.407767
								if( d_k > -4.30849 )
									ret := -0.257310
						if( ad_mf > -1508.71 )
							if( ad <= -833.773 )
								if( d_k <= -3.16489 )
									ret := 0.335777
								if( d_k > -3.16489 )
									ret := -0.166144
							if( ad > -833.773 )
								if( smoothD_d <= 31.7248 )
									ret := 0.080114
								if( smoothD_d > 31.7248 )
									ret := -0.048324
					if( rsi1 > 50.351 )
						if( mf <= 0.095767 )
							if( rsi1 <= 58.6927 )
								if( d_k <= -5.7293 )
									ret := 0.532603
								if( d_k > -5.7293 )
									ret := 0.145455
							if( rsi1 > 58.6927 )
								if( d_k <= -6.12503 )
									ret := 0.655248
								if( d_k > -6.12503 )
									ret := 0.458163
						if( mf > 0.095767 )
							if( rsi1 <= 67.38 )
								if( d_k <= -0.56014 )
									ret := 0.226982
								if( d_k > -0.56014 )
									ret := -0.018204
							if( rsi1 > 67.38 )
								if( ad <= 3253.71 )
									ret := 0.397226
								if( ad > 3253.71 )
									ret := 0.674847
				if( smoothK_k > 91.8528 )
					if( rsi1 <= 60.3602 )
						if( ad_mf <= -264.415 )
							if( k <= 98.171 )
								if( rsi1 <= 49.7232 )
									ret := 0.474138
								if( rsi1 > 49.7232 )
									ret := 0.753036 // buy
							if( k > 98.171 )
								if( ad_mf <= -1050.12 )
									ret := 0.639640
								if( ad_mf > -1050.12 )
									ret := 0.187050
						if( ad_mf > -264.415 )
							if( d <= 89.274 )
								if( d_k <= -9.74567 )
									ret := 0.442940
								if( d_k > -9.74567 )
									ret := 0.011494
							if( d > 89.274 )
								if( rsi1 <= 50.6536 )
									ret := -0.207143
								if( rsi1 > 50.6536 )
									ret := 0.215947
					if( rsi1 > 60.3602 )
						if( d_k <= -5.06863 )
							if( smoothK_k <= 96.9994 )
								if( smoothK_k <= 96.3812 )
									ret := 0.674777
								if( smoothK_k > 96.3812 )
									ret := 0.837681 // buy
							if( smoothK_k > 96.9994 )
								if( rsi1 <= 72.1646 )
									ret := 0.419643
								if( rsi1 > 72.1646 )
									ret := 0.751969 // buy
						if( d_k > -5.06863 )
							if( mf <= 0.217737 )
								if( rsi1 <= 78.8089 )
									ret := 0.533981
								if( rsi1 > 78.8089 )
									ret := 0.757576 // buy
							if( mf > 0.217737 )
								if( rsi1 <= 72.3735 )
									ret := -0.842105 // sell
								if( rsi1 > 72.3735 )
									ret := 0.500000
			if( d > 94.6151 )
				if( rsi1 <= 71.1676 )
					if( smoothK_k <= 90.7081 )
						if( rsi1 <= 58.2938 )
							if( rsi1 <= 40.9209 )
								ret := 0.000000
							if( rsi1 > 40.9209 )
								if( smoothK_k <= 90.4835 )
									ret := -0.647887
								if( smoothK_k > 90.4835 )
									ret := -0.066667
						if( rsi1 > 58.2938 )
							if( rsi1 <= 64.1427 )
								if( mf <= 0.011924 )
									ret := 0.428571
								if( mf > 0.011924 )
									ret := -0.320000
							if( rsi1 > 64.1427 )
								if( k <= 93.346 )
									ret := 0.684211
								if( k > 93.346 )
									ret := 0.176471
					if( smoothK_k > 90.7081 )
						if( rsi1 <= 58.7036 )
							if( mf <= -0.014993 )
								if( ad <= 219.283 )
									ret := 0.367304
								if( ad > 219.283 )
									ret := 0.149635
							if( mf > -0.014993 )
								if( rsi1 <= 50.5092 )
									ret := -0.238938
								if( rsi1 > 50.5092 )
									ret := 0.194268
						if( rsi1 > 58.7036 )
							if( k <= 99.9968 )
								if( smoothK_k <= 96.4017 )
									ret := 0.457766
								if( smoothK_k > 96.4017 )
									ret := 0.669856
							if( k > 99.9968 )
								if( d_k <= -2.0842 )
									ret := 0.384058
								if( d_k > -2.0842 )
									ret := 0.201389
				if( rsi1 > 71.1676 )
					if( mf <= 0.311862 )
						if( k <= 98.556 )
							if( ad <= 1156.89 )
								if( ad_mf <= 1089.86 )
									ret := 0.664151
								if( ad_mf > 1089.86 )
									ret := -0.193548
							if( ad > 1156.89 )
								if( smoothD_d <= 96.0627 )
									ret := 0.841969 // buy
								if( smoothD_d > 96.0627 )
									ret := 0.529412
						if( k > 98.556 )
							if( rsi1 <= 79.5958 )
								if( ad <= 709.778 )
									ret := 0.745614 // buy
								if( ad > 709.778 )
									ret := 0.530928
							if( rsi1 > 79.5958 )
								if( smoothD_d <= 95.3632 )
									ret := 0.826577 // buy
								if( smoothD_d > 95.3632 )
									ret := 0.903190 // buy
					if( mf > 0.311862 )
						if( ad_mf <= 3285.09 )
							if( rsi1 <= 87.7111 )
								if( k <= 98.1952 )
									ret := 0.153846
								if( k > 98.1952 )
									ret := -0.500000
							if( rsi1 > 87.7111 )
								if( ad_mf <= 1792.3 )
									ret := 0.725000 // buy
								if( ad_mf > 1792.3 )
									ret := 0.153846
						if( ad_mf > 3285.09 )
							if( smoothK_k <= 93.9684 )
								ret := 0.583333
							if( smoothK_k > 93.9684 )
								if( rsi1 <= 92.2694 )
									ret := 0.818182 // buy
								if( rsi1 > 92.2694 )
									ret := 1.000000 // buy
		if( d_k > 3.21716 )
			if( smoothK_k <= 72.993 )
				if( d_k <= 14.0685 )
					if( k <= 59.1405 )
						if( rsi1 <= 44.6683 )
							if( mf <= -0.211095 )
								if( smoothD_d <= 53.482 )
									ret := -0.263158
								if( smoothD_d > 53.482 )
									ret := 0.588235
							if( mf > -0.211095 )
								if( d <= 46.0578 )
									ret := -0.323843
								if( d > 46.0578 )
									ret := -0.584211
						if( rsi1 > 44.6683 )
							if( d <= 49.0911 )
								if( mf <= 0.061031 )
									ret := 0.189655
								if( mf > 0.061031 )
									ret := -0.095109
							if( d > 49.0911 )
								if( ad_mf <= 276.704 )
									ret := -0.054633
								if( ad_mf > 276.704 )
									ret := -0.362676
					if( k > 59.1405 )
						if( rsi1 <= 60.1813 )
							if( smoothK_k <= 66.3278 )
								if( ad_mf <= 412.761 )
									ret := -0.138182
								if( ad_mf > 412.761 )
									ret := -0.553350
							if( smoothK_k > 66.3278 )
								if( ad_mf <= 336.382 )
									ret := -0.277108
								if( ad_mf > 336.382 )
									ret := -0.695962
						if( rsi1 > 60.1813 )
							if( mf <= 0.097076 )
								if( k <= 71.9292 )
									ret := 0.443340
								if( k > 71.9292 )
									ret := 0.241379
							if( mf > 0.097076 )
								if( rsi1 <= 75.5164 )
									ret := -0.118890
								if( rsi1 > 75.5164 )
									ret := 0.412698
				if( d_k > 14.0685 )
					if( rsi1 <= 52.9673 )
						if( rsi1 <= 37.7826 )
							if( d <= 77.7873 )
								if( ad_mf <= -78.6092 )
									ret := -0.574561
								if( ad_mf > -78.6092 )
									ret := -0.741325 // sell
							if( d > 77.7873 )
								if( ad <= 369.665 )
									ret := -0.255319
								if( ad > 369.665 )
									ret := -0.833333 // sell
						if( rsi1 > 37.7826 )
							if( k <= 59.1099 )
								if( ad <= 700.642 )
									ret := -0.438088
								if( ad > 700.642 )
									ret := -0.746875 // sell
							if( k > 59.1099 )
								if( rsi1 <= 47.4457 )
									ret := -0.438776
								if( rsi1 > 47.4457 )
									ret := -0.125000
					if( rsi1 > 52.9673 )
						if( ad_mf <= 767.282 )
							if( rsi1 <= 61.5715 )
								if( smoothD_d <= 59.6845 )
									ret := 0.067194
								if( smoothD_d > 59.6845 )
									ret := -0.267057
							if( rsi1 > 61.5715 )
								if( ad_mf <= -6638.91 )
									ret := -0.583333
								if( ad_mf > -6638.91 )
									ret := 0.251185
						if( ad_mf > 767.282 )
							if( smoothD_d <= 80.3115 )
								if( rsi1 <= 71.9482 )
									ret := -0.606299
								if( rsi1 > 71.9482 )
									ret := 0.142857
							if( smoothD_d > 80.3115 )
								if( ad <= 1233.78 )
									ret := 0.615385
								if( ad > 1233.78 )
									ret := -0.193548
			if( smoothK_k > 72.993 )
				if( d <= 93.9978 )
					if( rsi1 <= 67.1718 )
						if( rsi1 <= 49.7248 )
							if( mf <= -0.205712 )
								if( rsi1 <= 41.2121 )
									ret := 0.363636
								if( rsi1 > 41.2121 )
									ret := 0.000000
							if( mf > -0.205712 )
								if( ad <= -1243.15 )
									ret := -0.800000 // sell
								if( ad > -1243.15 )
									ret := -0.456325
						if( rsi1 > 49.7248 )
							if( ad_mf <= 758.589 )
								if( d_k <= 12.3658 )
									ret := -0.000625
								if( d_k > 12.3658 )
									ret := 0.913043 // buy
							if( ad_mf > 758.589 )
								if( smoothK_k <= 84.1798 )
									ret := -0.504298
								if( smoothK_k > 84.1798 )
									ret := 0.037037
					if( rsi1 > 67.1718 )
						if( mf <= 0.296617 )
							if( rsi1 <= 75.9148 )
								if( ad <= 2128.47 )
									ret := 0.417313
								if( ad > 2128.47 )
									ret := -0.609375
							if( rsi1 > 75.9148 )
								if( ad <= -1149.31 )
									ret := 0.137931
								if( ad > -1149.31 )
									ret := 0.606232
						if( mf > 0.296617 )
							if( ad_mf <= 84.7482 )
								ret := 0.600000
							if( ad_mf > 84.7482 )
								if( rsi1 <= 86.5892 )
									ret := -0.371429
								if( rsi1 > 86.5892 )
									ret := 0.769231 // buy
				if( d > 93.9978 )
					if( rsi1 <= 62.7505 )
						if( smoothK_k <= 86.0681 )
							if( ad <= 2229.3 )
								if( mf <= -0.113846 )
									ret := -0.090909
								if( mf > -0.113846 )
									ret := 0.386364
							if( ad > 2229.3 )
								ret := -0.550000
						if( smoothK_k > 86.0681 )
							if( ad_mf <= 1030.5 )
								if( ad <= -1185.18 )
									ret := 0.434783
								if( ad > -1185.18 )
									ret := -0.069536
							if( ad_mf > 1030.5 )
								if( k <= 90.7162 )
									ret := 0.000000
								if( k > 90.7162 )
									ret := -0.685185
					if( rsi1 > 62.7505 )
						if( ad_mf <= -706.979 )
							if( smoothD_d <= 93.1232 )
								if( ad <= -857.759 )
									ret := 0.297872
								if( ad > -857.759 )
									ret := -0.500000
							if( smoothD_d > 93.1232 )
								if( smoothD_d <= 93.8301 )
									ret := 0.666667
								if( smoothD_d > 93.8301 )
									ret := 0.142857
						if( ad_mf > -706.979 )
							if( mf <= 0.114117 )
								if( mf <= 0.005802 )
									ret := 0.570588
								if( mf > 0.005802 )
									ret := 0.742857 // buy
							if( mf > 0.114117 )
								if( mf <= 0.205754 )
									ret := 0.402985
								if( mf > 0.205754 )
									ret := 0.693694
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BTCUSDT_30Min_a0c7f671(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


