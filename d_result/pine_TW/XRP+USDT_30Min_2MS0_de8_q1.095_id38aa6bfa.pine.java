//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: XRPUSDT_30Min_2MS0_38aa6bfa Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2MS0_38aa6bfa", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_38aa6bfa(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothD_d <= 40.927 )
		if( smoothK_k <= 28.911 )
			if( d <= 29.7378 )
				if( d_k <= -1.50462 )
					if( smoothK_k <= 13.0252 )
						if( Positive_Money_Flow_Sum <= 1.33876e+08 )
							if( k <= 10.1172 )
								if( rsi1 <= 33.3215 )
									ret := -0.569199
								if( rsi1 > 33.3215 )
									ret := -0.182266
							if( k > 10.1172 )
								if( Raw_Money_Flow <= 1.27501e+07 )
									ret := -0.283422
								if( Raw_Money_Flow > 1.27501e+07 )
									ret := 0.135458
						if( Positive_Money_Flow_Sum > 1.33876e+08 )
							if( Negative_Money_Flow <= 5.6766e+07 )
								if( rsi1 <= 33.0403 )
									ret := -0.771930 // sell
								if( rsi1 > 33.0403 )
									ret := -0.009259
							if( Negative_Money_Flow > 5.6766e+07 )
								if( Money_Flow_Ratio <= 0.699084 )
									ret := 0.035714
								if( Money_Flow_Ratio > 0.699084 )
									ret := 0.944444 // buy
					if( smoothK_k > 13.0252 )
						if( d_k <= -6.74072 )
							if( Positive_Money_Flow_Sum <= 4.19991e+07 )
								if( Typical_Price <= 0.408029 )
									ret := 0.285935
								if( Typical_Price > 0.408029 )
									ret := -0.097368
							if( Positive_Money_Flow_Sum > 4.19991e+07 )
								if( k <= 22.1685 )
									ret := 0.004505
								if( k > 22.1685 )
									ret := 0.358714
						if( d_k > -6.74072 )
							if( Negative_Money_Flow <= 5.21752e+06 )
								if( rsi1 <= 41.398 )
									ret := -0.359776
								if( rsi1 > 41.398 )
									ret := 0.023873
							if( Negative_Money_Flow > 5.21752e+06 )
								if( rsi1 <= 32.5279 )
									ret := -0.292208
								if( rsi1 > 32.5279 )
									ret := 0.320721
				if( d_k > -1.50462 )
					if( Typical_Price <= 0.318296 )
						if( Positive_Money_Flow_Sum <= 4.63603e+07 )
							if( smoothK_k <= 10.8126 )
								if( Typical_Price <= 0.282479 )
									ret := 0.023102
								if( Typical_Price > 0.282479 )
									ret := -0.427027
							if( smoothK_k > 10.8126 )
								if( rsi1 <= 34.7633 )
									ret := -0.139241
								if( rsi1 > 34.7633 )
									ret := 0.294118
						if( Positive_Money_Flow_Sum > 4.63603e+07 )
							if( smoothK_k <= -1.18442 )
								if( MFI <= 44.2956 )
									ret := -0.111111
								if( MFI > 44.2956 )
									ret := -0.166667
							if( smoothK_k > -1.18442 )
								if( MFI <= 49.0259 )
									ret := 0.298507
								if( MFI > 49.0259 )
									ret := 0.888889 // buy
					if( Typical_Price > 0.318296 )
						if( smoothK_k <= 15.1615 )
							if( Negative_Money_Flow_Sum <= 9.02623e+06 )
								if( rsi1 <= 42.8464 )
									ret := -0.390651
								if( rsi1 > 42.8464 )
									ret := -0.158904
							if( Negative_Money_Flow_Sum > 9.02623e+06 )
								if( rsi1 <= 42.6759 )
									ret := -0.632002
								if( rsi1 > 42.6759 )
									ret := -0.288985
						if( smoothK_k > 15.1615 )
							if( Negative_Money_Flow <= 2.40963e+06 )
								if( Typical_Price <= 0.504276 )
									ret := -0.286885
								if( Typical_Price > 0.504276 )
									ret := -0.490706
							if( Negative_Money_Flow > 2.40963e+06 )
								if( d_k <= 1.90954 )
									ret := -0.031496
								if( d_k > 1.90954 )
									ret := -0.302419
			if( d > 29.7378 )
				if( k <= 25.3819 )
					if( rsi1 <= 44.9839 )
						if( Raw_Money_Flow <= 1.01433e+06 )
							if( Typical_Price <= 0.312751 )
								if( Negative_Money_Flow <= 479524 )
									ret := -0.095238
								if( Negative_Money_Flow > 479524 )
									ret := 0.357143
							if( Typical_Price > 0.312751 )
								if( MFI <= 61.6322 )
									ret := -0.239130
								if( MFI > 61.6322 )
									ret := -0.785714 // sell
						if( Raw_Money_Flow > 1.01433e+06 )
							if( MFI_High <= -32.543 )
								if( Positive_Money_Flow_Sum <= 5.48074e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 5.48074e+06 )
									ret := -0.604240
							if( MFI_High > -32.543 )
								if( MFI <= 68.1788 )
									ret := -0.744304 // sell
								if( MFI > 68.1788 )
									ret := -0.894737 // sell
					if( rsi1 > 44.9839 )
						if( MFI_High <= -23.1539 )
							if( Money_Flow_Ratio <= 0.84112 )
								if( Negative_Money_Flow <= 3.31277e+06 )
									ret := 0.025641
								if( Negative_Money_Flow > 3.31277e+06 )
									ret := 0.622222
							if( Money_Flow_Ratio > 0.84112 )
								if( Negative_Money_Flow_Sum <= 2.15775e+08 )
									ret := -0.112500
								if( Negative_Money_Flow_Sum > 2.15775e+08 )
									ret := -1.000000 // sell
						if( MFI_High > -23.1539 )
							if( Typical_Price <= 0.6443 )
								if( Negative_Money_Flow <= 1.18456e+07 )
									ret := -0.456261
								if( Negative_Money_Flow > 1.18456e+07 )
									ret := 0.500000
							if( Typical_Price > 0.6443 )
								if( rsi1 <= 71.7772 )
									ret := -0.691919
								if( rsi1 > 71.7772 )
									ret := 0.333333
				if( k > 25.3819 )
					if( rsi1 <= 43.2539 )
						if( smoothD_d <= 32.5251 )
							if( Positive_Money_Flow_Sum <= 7.82739e+06 )
								if( Typical_Price <= 0.238847 )
									ret := 0.625000
								if( Typical_Price > 0.238847 )
									ret := -0.106383
							if( Positive_Money_Flow_Sum > 7.82739e+06 )
								if( Positive_Money_Flow <= 1.14451e+06 )
									ret := -0.447059
								if( Positive_Money_Flow > 1.14451e+06 )
									ret := -0.711864 // sell
						if( smoothD_d > 32.5251 )
							if( Positive_Money_Flow_Sum <= 7.70395e+06 )
								if( smoothD_d <= 35.259 )
									ret := -0.384615
								if( smoothD_d > 35.259 )
									ret := 0.181818
							if( Positive_Money_Flow_Sum > 7.70395e+06 )
								if( Typical_Price <= 0.553333 )
									ret := -0.642857
								if( Typical_Price > 0.553333 )
									ret := -0.861111 // sell
					if( rsi1 > 43.2539 )
						if( MFI_High <= -23.7797 )
							if( Negative_Money_Flow <= 1.685e+06 )
								if( Money_Flow_Ratio <= 0.904308 )
									ret := 0.170455
								if( Money_Flow_Ratio > 0.904308 )
									ret := -0.320312
							if( Negative_Money_Flow > 1.685e+06 )
								if( k <= 27.3867 )
									ret := 0.590909
								if( k > 27.3867 )
									ret := 0.131579
						if( MFI_High > -23.7797 )
							if( d_k <= 6.0713 )
								if( Negative_Money_Flow <= 3.41077e+06 )
									ret := -0.201493
								if( Negative_Money_Flow > 3.41077e+06 )
									ret := 0.516667
							if( d_k > 6.0713 )
								if( d <= 37.1874 )
									ret := -0.067669
								if( d > 37.1874 )
									ret := -0.471947
		if( smoothK_k > 28.911 )
			if( d_k <= -2.01511 )
				if( Positive_Money_Flow_Sum <= 3.85205e+07 )
					if( Typical_Price <= 0.411158 )
						if( Negative_Money_Flow <= 1.0371e+06 )
							if( Raw_Money_Flow <= 7.805e+06 )
								if( smoothK_k <= 29.8508 )
									ret := -0.100000
								if( smoothK_k > 29.8508 )
									ret := 0.311935
							if( Raw_Money_Flow > 7.805e+06 )
								if( Positive_Money_Flow_Sum <= 2.90621e+07 )
									ret := -0.357143
								if( Positive_Money_Flow_Sum > 2.90621e+07 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.0371e+06 )
							if( MFI_Low <= 11.7074 )
								if( MFI_Low <= 0.6659 )
									ret := 0.464286
								if( MFI_Low > 0.6659 )
									ret := 0.822660 // buy
							if( MFI_Low > 11.7074 )
								if( Negative_Money_Flow_Sum <= 3.36613e+07 )
									ret := 0.547855
								if( Negative_Money_Flow_Sum > 3.36613e+07 )
									ret := -0.044444
					if( Typical_Price > 0.411158 )
						if( rsi1 <= 39.0172 )
							if( Negative_Money_Flow <= 5.19029e+06 )
								if( Money_Flow_Ratio <= 0.43224 )
									ret := -0.135802
								if( Money_Flow_Ratio > 0.43224 )
									ret := -0.462963
							if( Negative_Money_Flow > 5.19029e+06 )
								if( rsi1 <= 28.7145 )
									ret := -0.158730
								if( rsi1 > 28.7145 )
									ret := 0.505435
						if( rsi1 > 39.0172 )
							if( Negative_Money_Flow_Sum <= 2.84751e+07 )
								if( Positive_Money_Flow <= 347731 )
									ret := 0.141524
								if( Positive_Money_Flow > 347731 )
									ret := -0.095522
							if( Negative_Money_Flow_Sum > 2.84751e+07 )
								if( Negative_Money_Flow_Sum <= 4.51919e+07 )
									ret := 0.392045
								if( Negative_Money_Flow_Sum > 4.51919e+07 )
									ret := 0.628912
				if( Positive_Money_Flow_Sum > 3.85205e+07 )
					if( rsi1 <= 31.8479 )
						if( MFI_Low <= 8.30517 )
							if( rsi1 <= 23.0239 )
								if( k <= 39.2286 )
									ret := -1.000000 // sell
								if( k > 39.2286 )
									ret := -0.090909
							if( rsi1 > 23.0239 )
								if( Negative_Money_Flow_Sum <= 1.77638e+08 )
									ret := -0.088235
								if( Negative_Money_Flow_Sum > 1.77638e+08 )
									ret := 0.714286 // buy
						if( MFI_Low > 8.30517 )
							if( Positive_Money_Flow <= 2.06196e+07 )
								if( MFI_High <= -50.3079 )
									ret := -0.703704 // sell
								if( MFI_High > -50.3079 )
									ret := -0.962264 // sell
							if( Positive_Money_Flow > 2.06196e+07 )
								ret := 0.000000
					if( rsi1 > 31.8479 )
						if( Negative_Money_Flow <= 3.5666e+06 )
							if( Negative_Money_Flow_Sum <= 5.21502e+07 )
								if( Positive_Money_Flow <= 7.63802e+06 )
									ret := 0.199301
								if( Positive_Money_Flow > 7.63802e+06 )
									ret := -0.302521
							if( Negative_Money_Flow_Sum > 5.21502e+07 )
								if( k <= 36.69 )
									ret := 0.161290
								if( k > 36.69 )
									ret := 0.454756
						if( Negative_Money_Flow > 3.5666e+06 )
							if( Typical_Price <= 0.73941 )
								if( Positive_Money_Flow_Sum <= 1.79767e+08 )
									ret := 0.491379
								if( Positive_Money_Flow_Sum > 1.79767e+08 )
									ret := -0.611111
							if( Typical_Price > 0.73941 )
								if( Typical_Price <= 1.56092 )
									ret := 0.757123 // buy
								if( Typical_Price > 1.56092 )
									ret := 0.000000
			if( d_k > -2.01511 )
				if( Negative_Money_Flow <= 2.41156e+06 )
					if( smoothK_k <= 33.8105 )
						if( k <= 36.4388 )
							if( Positive_Money_Flow_Sum <= 9.90557e+07 )
								if( rsi1 <= 56.3261 )
									ret := -0.486974
								if( rsi1 > 56.3261 )
									ret := 0.051546
							if( Positive_Money_Flow_Sum > 9.90557e+07 )
								if( Typical_Price <= 0.545565 )
									ret := -0.750000 // sell
								if( Typical_Price > 0.545565 )
									ret := 0.084211
						if( k > 36.4388 )
							if( Money_Flow_Ratio <= 1.16462 )
								if( Negative_Money_Flow_Sum <= 4.61609e+07 )
									ret := -0.153846
								if( Negative_Money_Flow_Sum > 4.61609e+07 )
									ret := -0.800000 // sell
							if( Money_Flow_Ratio > 1.16462 )
								ret := -1.000000 // sell
					if( smoothK_k > 33.8105 )
						if( MFI_Low <= 37.6506 )
							if( rsi1 <= 48.7035 )
								if( Typical_Price <= 0.696597 )
									ret := -0.264463
								if( Typical_Price > 0.696597 )
									ret := -0.750000 // sell
							if( rsi1 > 48.7035 )
								if( rsi1 <= 59.0682 )
									ret := -0.011765
								if( rsi1 > 59.0682 )
									ret := 0.523810
						if( MFI_Low > 37.6506 )
							if( smoothD_d <= 35.7604 )
								if( Negative_Money_Flow_Sum <= 2.75685e+07 )
									ret := -0.642857
								if( Negative_Money_Flow_Sum > 2.75685e+07 )
									ret := 0.000000
							if( smoothD_d > 35.7604 )
								if( MFI_Low <= 39.4053 )
									ret := 0.366667
								if( MFI_Low > 39.4053 )
									ret := -0.018405
				if( Negative_Money_Flow > 2.41156e+06 )
					if( smoothK_k <= 38.4363 )
						if( MFI <= 49.4299 )
							if( smoothK_k <= 36.3967 )
								if( Typical_Price <= 0.474008 )
									ret := 0.317308
								if( Typical_Price > 0.474008 )
									ret := -0.260714
							if( smoothK_k > 36.3967 )
								if( Negative_Money_Flow <= 3.75534e+06 )
									ret := 0.062500
								if( Negative_Money_Flow > 3.75534e+06 )
									ret := -0.696429
						if( MFI > 49.4299 )
							if( MFI <= 66.5361 )
								if( MFI_Low <= 43.0891 )
									ret := 0.096220
								if( MFI_Low > 43.0891 )
									ret := 0.604167
							if( MFI > 66.5361 )
								if( smoothD_d <= 32.8634 )
									ret := 0.230769
								if( smoothD_d > 32.8634 )
									ret := -0.430233
					if( smoothK_k > 38.4363 )
						if( rsi1 <= 30.9109 )
							ret := -0.500000
						if( rsi1 > 30.9109 )
							if( MFI_High <= -43.9277 )
								ret := 0.894737 // buy
							if( MFI_High > -43.9277 )
								if( Negative_Money_Flow_Sum <= 5.71616e+07 )
									ret := 0.155556
								if( Negative_Money_Flow_Sum > 5.71616e+07 )
									ret := 0.611111
	if( smoothD_d > 40.927 )
		if( rsi1 <= 54.8087 )
			if( MFI_Low <= 24.0372 )
				if( MFI_High <= -50.4412 )
					if( d_k <= -2.86738 )
						if( Positive_Money_Flow_Sum <= 7.12854e+07 )
							if( Negative_Money_Flow <= 5.097e+06 )
								if( Negative_Money_Flow_Sum <= 1.28927e+08 )
									ret := 0.361246
								if( Negative_Money_Flow_Sum > 1.28927e+08 )
									ret := -0.079646
							if( Negative_Money_Flow > 5.097e+06 )
								if( smoothK_k <= 50.0653 )
									ret := -0.315789
								if( smoothK_k > 50.0653 )
									ret := 0.664671
						if( Positive_Money_Flow_Sum > 7.12854e+07 )
							if( Typical_Price <= 0.624045 )
								if( smoothD_d <= 52.2614 )
									ret := -0.846154 // sell
								if( smoothD_d > 52.2614 )
									ret := 0.869565 // buy
							if( Typical_Price > 0.624045 )
								if( Negative_Money_Flow <= 2.75854e+07 )
									ret := 0.809524 // buy
								if( Negative_Money_Flow > 2.75854e+07 )
									ret := 1.000000 // buy
					if( d_k > -2.86738 )
						if( smoothK_k <= 55.7438 )
							if( MFI <= 17.637 )
								if( Money_Flow_Ratio <= 0.17547 )
									ret := 0.416667
								if( Money_Flow_Ratio > 0.17547 )
									ret := 0.000000
							if( MFI > 17.637 )
								if( Negative_Money_Flow_Sum <= 1.32005e+08 )
									ret := -0.209231
								if( Negative_Money_Flow_Sum > 1.32005e+08 )
									ret := -0.787879 // sell
						if( smoothK_k > 55.7438 )
							if( Typical_Price <= 0.776848 )
								if( Negative_Money_Flow <= 3.5214e+06 )
									ret := 0.100000
								if( Negative_Money_Flow > 3.5214e+06 )
									ret := 0.601770
							if( Typical_Price > 0.776848 )
								if( rsi1 <= 33.1452 )
									ret := -0.750000 // sell
								if( rsi1 > 33.1452 )
									ret := -0.076923
				if( MFI_High > -50.4412 )
					if( d_k <= -4.30564 )
						if( Raw_Money_Flow <= 6.34887e+06 )
							if( Raw_Money_Flow <= 2.48988e+06 )
								if( smoothD_d <= 74.1402 )
									ret := 0.186916
								if( smoothD_d > 74.1402 )
									ret := -0.047337
							if( Raw_Money_Flow > 2.48988e+06 )
								if( rsi1 <= 44.829 )
									ret := -0.146809
								if( rsi1 > 44.829 )
									ret := 0.492308
						if( Raw_Money_Flow > 6.34887e+06 )
							if( rsi1 <= 36.0545 )
								if( d_k <= -12.8083 )
									ret := 0.130435
								if( d_k > -12.8083 )
									ret := -0.404959
							if( rsi1 > 36.0545 )
								if( d_k <= -8.91972 )
									ret := 0.739816 // buy
								if( d_k > -8.91972 )
									ret := 0.398515
					if( d_k > -4.30564 )
						if( d_k <= 1.23174 )
							if( d <= 70.5562 )
								if( rsi1 <= 39.0322 )
									ret := -0.620301
								if( rsi1 > 39.0322 )
									ret := 0.055130
							if( d > 70.5562 )
								if( smoothK_k <= 89.8821 )
									ret := 0.062112
								if( smoothK_k > 89.8821 )
									ret := 0.287709
						if( d_k > 1.23174 )
							if( Positive_Money_Flow_Sum <= 5.89472e+07 )
								if( smoothK_k <= 48.7007 )
									ret := -0.335714
								if( smoothK_k > 48.7007 )
									ret := -0.082157
							if( Positive_Money_Flow_Sum > 5.89472e+07 )
								if( rsi1 <= 43.5621 )
									ret := -0.706019 // sell
								if( rsi1 > 43.5621 )
									ret := -0.031674
			if( MFI_Low > 24.0372 )
				if( d_k <= 2.5237 )
					if( Negative_Money_Flow_Sum <= 3.66628e+08 )
						if( d_k <= -3.02191 )
							if( Typical_Price <= 0.713726 )
								if( Negative_Money_Flow <= 4.13388e+06 )
									ret := -0.112228
								if( Negative_Money_Flow > 4.13388e+06 )
									ret := 0.248889
							if( Typical_Price > 0.713726 )
								if( rsi1 <= 48.2859 )
									ret := 0.076923
								if( rsi1 > 48.2859 )
									ret := 0.464052
						if( d_k > -3.02191 )
							if( Positive_Money_Flow <= 3.47908e+06 )
								if( Typical_Price <= 0.817504 )
									ret := -0.107977
								if( Typical_Price > 0.817504 )
									ret := 0.299213
							if( Positive_Money_Flow > 3.47908e+06 )
								if( Typical_Price <= 0.627817 )
									ret := -0.383387
								if( Typical_Price > 0.627817 )
									ret := -0.104938
					if( Negative_Money_Flow_Sum > 3.66628e+08 )
						if( k <= 86.0661 )
							ret := -1.000000 // sell
						if( k > 86.0661 )
							ret := -0.111111
				if( d_k > 2.5237 )
					if( Typical_Price <= 0.303131 )
						if( rsi1 <= 43.3567 )
							if( Negative_Money_Flow_Sum <= 2.59569e+07 )
								if( Raw_Money_Flow <= 739158 )
									ret := 0.307692
								if( Raw_Money_Flow > 739158 )
									ret := -0.607143
							if( Negative_Money_Flow_Sum > 2.59569e+07 )
								ret := 0.150000
						if( rsi1 > 43.3567 )
							if( MFI_High <= -17.3748 )
								if( Positive_Money_Flow_Sum <= 8.27696e+06 )
									ret := 0.158940
								if( Positive_Money_Flow_Sum > 8.27696e+06 )
									ret := 0.572650
							if( MFI_High > -17.3748 )
								if( MFI_High <= -14.7017 )
									ret := -0.166667
								if( MFI_High > -14.7017 )
									ret := -0.750000 // sell
					if( Typical_Price > 0.303131 )
						if( d_k <= 10.7965 )
							if( rsi1 <= 43.9738 )
								if( Positive_Money_Flow <= 6.01780e+06 )
									ret := -0.561151
								if( Positive_Money_Flow > 6.01780e+06 )
									ret := -0.922581 // sell
							if( rsi1 > 43.9738 )
								if( Positive_Money_Flow <= 9.87283e+06 )
									ret := -0.260912
								if( Positive_Money_Flow > 9.87283e+06 )
									ret := -0.642405
						if( d_k > 10.7965 )
							if( Positive_Money_Flow <= 3.76247e+06 )
								if( rsi1 <= 43.8566 )
									ret := -0.670185
								if( rsi1 > 43.8566 )
									ret := -0.386080
							if( Positive_Money_Flow > 3.76247e+06 )
								if( smoothD_d <= 68.5779 )
									ret := -0.820722 // sell
								if( smoothD_d > 68.5779 )
									ret := -0.604575
		if( rsi1 > 54.8087 )
			if( MFI_High <= -14.8796 )
				if( rsi1 <= 67.055 )
					if( MFI_Low <= 34.8426 )
						if( Raw_Money_Flow <= 1.53423e+06 )
							if( Typical_Price <= 0.463751 )
								if( Raw_Money_Flow <= 506573 )
									ret := 0.123967
								if( Raw_Money_Flow > 506573 )
									ret := 0.420499
							if( Typical_Price > 0.463751 )
								if( d <= 91.1548 )
									ret := 0.197211
								if( d > 91.1548 )
									ret := 0.012903
						if( Raw_Money_Flow > 1.53423e+06 )
							if( d_k <= -0.03879 )
								if( Negative_Money_Flow <= 3.99883e+06 )
									ret := 0.587882
								if( Negative_Money_Flow > 3.99883e+06 )
									ret := 0.771753 // buy
							if( d_k > -0.03879 )
								if( MFI_High <= -35.5408 )
									ret := 0.491784
								if( MFI_High > -35.5408 )
									ret := 0.245505
					if( MFI_Low > 34.8426 )
						if( Raw_Money_Flow <= 9.78668e+06 )
							if( d_k <= 4.06964 )
								if( Negative_Money_Flow <= 2.15103e+06 )
									ret := 0.266110
								if( Negative_Money_Flow > 2.15103e+06 )
									ret := 0.563249
							if( d_k > 4.06964 )
								if( k <= 49.5157 )
									ret := -0.105442
								if( k > 49.5157 )
									ret := 0.124756
						if( Raw_Money_Flow > 9.78668e+06 )
							if( Negative_Money_Flow_Sum <= 7.58738e+07 )
								if( MFI_Low <= 38.0087 )
									ret := 0.257143
								if( MFI_Low > 38.0087 )
									ret := -0.380282
							if( Negative_Money_Flow_Sum > 7.58738e+07 )
								if( MFI <= 57.0273 )
									ret := -0.162011
								if( MFI > 57.0273 )
									ret := 0.293694
				if( rsi1 > 67.055 )
					if( k <= 43.7644 )
						if( rsi1 <= 68.3462 )
							ret := 0.125000
						if( rsi1 > 68.3462 )
							ret := -1.000000 // sell
					if( k > 43.7644 )
						if( smoothK_k <= 92.6297 )
							if( Typical_Price <= 0.287363 )
								if( Negative_Money_Flow_Sum <= 4.73792e+06 )
									ret := -0.166667
								if( Negative_Money_Flow_Sum > 4.73792e+06 )
									ret := 0.469697
							if( Typical_Price > 0.287363 )
								if( smoothK_k <= 48.5028 )
									ret := 0.381818
								if( smoothK_k > 48.5028 )
									ret := 0.747997 // buy
						if( smoothK_k > 92.6297 )
							if( rsi1 <= 73.7699 )
								if( Negative_Money_Flow_Sum <= 1.12829e+07 )
									ret := 0.231405
								if( Negative_Money_Flow_Sum > 1.12829e+07 )
									ret := 0.557260
							if( rsi1 > 73.7699 )
								if( MFI_Low <= 23.4303 )
									ret := 0.477833
								if( MFI_Low > 23.4303 )
									ret := 0.719001 // buy
			if( MFI_High > -14.8796 )
				if( k <= 80.0859 )
					if( d_k <= 3.29603 )
						if( MFI <= 85.5133 )
							if( Positive_Money_Flow <= 196385 )
								if( Negative_Money_Flow_Sum <= 1.82797e+07 )
									ret := 0.281356
								if( Negative_Money_Flow_Sum > 1.82797e+07 )
									ret := 0.584906
							if( Positive_Money_Flow > 196385 )
								if( MFI_High <= -14.1486 )
									ret := -0.238636
								if( MFI_High > -14.1486 )
									ret := 0.201646
						if( MFI > 85.5133 )
							if( Positive_Money_Flow_Sum <= 6.53641e+07 )
								if( MFI_High <= 8.30138 )
									ret := -0.827586 // sell
								if( MFI_High > 8.30138 )
									ret := -0.320000
							if( Positive_Money_Flow_Sum > 6.53641e+07 )
								if( Typical_Price <= 0.553011 )
									ret := 0.583333
								if( Typical_Price > 0.553011 )
									ret := -0.454545
					if( d_k > 3.29603 )
						if( MFI_Low <= 56.229 )
							if( Typical_Price <= 1.45009 )
								if( Positive_Money_Flow <= 7.464e+06 )
									ret := -0.052147
								if( Positive_Money_Flow > 7.464e+06 )
									ret := -0.314456
							if( Typical_Price > 1.45009 )
								if( Money_Flow_Ratio <= 2.74857 )
									ret := -0.761905 // sell
								if( Money_Flow_Ratio > 2.74857 )
									ret := -1.000000 // sell
						if( MFI_Low > 56.229 )
							if( Positive_Money_Flow_Sum <= 1.17966e+08 )
								if( MFI_Low <= 75.9079 )
									ret := -0.231488
								if( MFI_Low > 75.9079 )
									ret := 0.966667 // buy
							if( Positive_Money_Flow_Sum > 1.17966e+08 )
								if( rsi1 <= 69.5528 )
									ret := -0.844828 // sell
								if( rsi1 > 69.5528 )
									ret := -0.304054
				if( k > 80.0859 )
					if( Typical_Price <= 0.310446 )
						if( Positive_Money_Flow <= 817680 )
							if( rsi1 <= 74.1606 )
								if( Positive_Money_Flow <= 101330 )
									ret := 0.091667
								if( Positive_Money_Flow > 101330 )
									ret := -0.270833
							if( rsi1 > 74.1606 )
								if( Negative_Money_Flow_Sum <= 1.85616e+06 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 1.85616e+06 )
									ret := 0.442623
						if( Positive_Money_Flow > 817680 )
							if( Raw_Money_Flow <= 9.69258e+06 )
								if( Money_Flow_Ratio <= 4.18629 )
									ret := -0.124224
								if( Money_Flow_Ratio > 4.18629 )
									ret := -0.625000
							if( Raw_Money_Flow > 9.69258e+06 )
								if( MFI <= 77.2211 )
									ret := -1.000000 // sell
								if( MFI > 77.2211 )
									ret := -0.285714
					if( Typical_Price > 0.310446 )
						if( d_k <= 2.33301 )
							if( rsi1 <= 76.1117 )
								if( MFI <= 78.9419 )
									ret := 0.443673
								if( MFI > 78.9419 )
									ret := 0.103448
							if( rsi1 > 76.1117 )
								if( Negative_Money_Flow_Sum <= 3.93575e+07 )
									ret := 0.730180 // buy
								if( Negative_Money_Flow_Sum > 3.93575e+07 )
									ret := 0.500000
						if( d_k > 2.33301 )
							if( Negative_Money_Flow_Sum <= 4.40919e+07 )
								if( rsi1 <= 75.2293 )
									ret := 0.163585
								if( rsi1 > 75.2293 )
									ret := 0.557377
							if( Negative_Money_Flow_Sum > 4.40919e+07 )
								if( Positive_Money_Flow_Sum <= 1.66118e+08 )
									ret := -0.618421
								if( Positive_Money_Flow_Sum > 1.66118e+08 )
									ret := 0.019231
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_XRPUSDT_30Min_38aa6bfa(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


