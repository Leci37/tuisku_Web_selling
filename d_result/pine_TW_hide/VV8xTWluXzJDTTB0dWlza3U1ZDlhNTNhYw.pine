//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: U_1Min_2CM0_5d9a53ac Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2CM0_5d9a53ac", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_5d9a53ac(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow <= 12.6744 )
		if( Negative_Money_Flow_Sum <= 348473 )
			if( ad_mf <= 126.864 )
				if( ad_mf <= -0.921478 )
					if( mf <= -0.032867 )
						if( ad_mf <= -490.321 )
							if( Negative_Money_Flow_Sum <= 36568.4 )
								if( Money_Flow_Ratio <= 1.50858 )
									ret := -0.900000 // sell
								if( Money_Flow_Ratio > 1.50858 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 36568.4 )
								if( MFI <= 34.7645 )
									ret := 0.305709
								if( MFI > 34.7645 )
									ret := 0.461905
						if( ad_mf > -490.321 )
							if( Raw_Money_Flow <= 52288.1 )
								if( Raw_Money_Flow <= 7171.71 )
									ret := 0.482759
								if( Raw_Money_Flow > 7171.71 )
									ret := 0.703863 // buy
							if( Raw_Money_Flow > 52288.1 )
								ret := -0.333333
					if( mf > -0.032867 )
						if( Positive_Money_Flow_Sum <= 39935.6 )
							if( ad <= -1337 )
								if( mf <= 0.002627 )
									ret := 0.750000 // buy
								if( mf > 0.002627 )
									ret := 0.000000
							if( ad > -1337 )
								if( Raw_Money_Flow <= 20972.2 )
									ret := 0.676471
								if( Raw_Money_Flow > 20972.2 )
									ret := 0.920000 // buy
						if( Positive_Money_Flow_Sum > 39935.6 )
							if( Typical_Price <= 16.7942 )
								if( Positive_Money_Flow_Sum <= 250943 )
									ret := -0.096618
								if( Positive_Money_Flow_Sum > 250943 )
									ret := 0.190909
							if( Typical_Price > 16.7942 )
								if( Negative_Money_Flow <= 19241 )
									ret := 0.141538
								if( Negative_Money_Flow > 19241 )
									ret := 0.437956
				if( ad_mf > -0.921478 )
					if( Negative_Money_Flow <= 43.659 )
						if( ad_mf <= 0.314925 )
							if( Typical_Price <= 19.9221 )
								if( Raw_Money_Flow <= 38618.6 )
									ret := -0.020202
								if( Raw_Money_Flow > 38618.6 )
									ret := -0.290323
							if( Typical_Price > 19.9221 )
								if( Negative_Money_Flow_Sum <= 299695 )
									ret := 0.109565
								if( Negative_Money_Flow_Sum > 299695 )
									ret := -0.352941
						if( ad_mf > 0.314925 )
							if( Raw_Money_Flow <= 29351.6 )
								if( Raw_Money_Flow <= 3058.69 )
									ret := 0.528302
								if( Raw_Money_Flow > 3058.69 )
									ret := 0.231788
							if( Raw_Money_Flow > 29351.6 )
								if( ad_mf <= 0.485767 )
									ret := -0.800000 // sell
								if( ad_mf > 0.485767 )
									ret := 0.000000
					if( Negative_Money_Flow > 43.659 )
						if( Money_Flow_Ratio <= 0.18061 )
							if( Raw_Money_Flow <= 27132 )
								if( Negative_Money_Flow <= 13036.3 )
									ret := 0.642857
								if( Negative_Money_Flow > 13036.3 )
									ret := 0.375000
							if( Raw_Money_Flow > 27132 )
								if( Negative_Money_Flow <= 31564.5 )
									ret := -0.500000
								if( Negative_Money_Flow > 31564.5 )
									ret := 0.142857
						if( Money_Flow_Ratio > 0.18061 )
							if( Raw_Money_Flow <= 8139.77 )
								if( ad_mf <= 0.003285 )
									ret := 0.178923
								if( ad_mf > 0.003285 )
									ret := 0.328105
							if( Raw_Money_Flow > 8139.77 )
								if( Negative_Money_Flow_Sum <= 39264 )
									ret := 0.385965
								if( Negative_Money_Flow_Sum > 39264 )
									ret := 0.128119
			if( ad_mf > 126.864 )
				if( Negative_Money_Flow <= 30233 )
					if( Negative_Money_Flow_Sum <= 177678 )
						if( mf <= -0.494712 )
							if( mf <= -0.607604 )
								ret := -0.571429
							if( mf > -0.607604 )
								ret := -1.000000 // sell
						if( mf > -0.494712 )
							if( Positive_Money_Flow_Sum <= 61572.4 )
								if( Negative_Money_Flow_Sum <= 74070.5 )
									ret := 0.302326
								if( Negative_Money_Flow_Sum > 74070.5 )
									ret := -0.102804
							if( Positive_Money_Flow_Sum > 61572.4 )
								if( Positive_Money_Flow_Sum <= 151329 )
									ret := -0.372263
								if( Positive_Money_Flow_Sum > 151329 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 177678 )
						if( MFI <= 34.5486 )
							if( MFI <= 13.4507 )
								if( Typical_Price <= 16.7788 )
									ret := 0.250000
								if( Typical_Price > 16.7788 )
									ret := 1.000000 // buy
							if( MFI > 13.4507 )
								if( mf <= -0.224703 )
									ret := 0.300000
								if( mf > -0.224703 )
									ret := -0.500000
						if( MFI > 34.5486 )
							if( Positive_Money_Flow_Sum <= 484421 )
								if( Typical_Price <= 23.0583 )
									ret := 0.745455 // buy
								if( Typical_Price > 23.0583 )
									ret := -0.400000
							if( Positive_Money_Flow_Sum > 484421 )
								if( Negative_Money_Flow <= 15766.8 )
									ret := -0.230769
								if( Negative_Money_Flow > 15766.8 )
									ret := 0.416667
				if( Negative_Money_Flow > 30233 )
					if( Positive_Money_Flow_Sum <= 435034 )
						if( Negative_Money_Flow_Sum <= 300001 )
							if( Positive_Money_Flow_Sum <= 35185 )
								if( Typical_Price <= 16.8267 )
									ret := 0.000000
								if( Typical_Price > 16.8267 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 35185 )
								if( Money_Flow_Ratio <= 0.967954 )
									ret := -0.657658
								if( Money_Flow_Ratio > 0.967954 )
									ret := -0.292683
						if( Negative_Money_Flow_Sum > 300001 )
							if( Raw_Money_Flow <= 36452.7 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 36452.7 )
								if( ad <= 2040.7 )
									ret := -1.000000 // sell
								if( ad > 2040.7 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 435034 )
						if( Negative_Money_Flow_Sum <= 304610 )
							if( Negative_Money_Flow_Sum <= 172034 )
								if( Negative_Money_Flow_Sum <= 141978 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 141978 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 172034 )
								if( ad_mf <= 1860.63 )
									ret := -0.583333
								if( ad_mf > 1860.63 )
									ret := 0.166667
						if( Negative_Money_Flow_Sum > 304610 )
							if( mf <= -0.332474 )
								ret := 1.000000 // buy
							if( mf > -0.332474 )
								if( Typical_Price <= 17.7794 )
									ret := 0.000000
								if( Typical_Price > 17.7794 )
									ret := 0.700000 // buy
		if( Negative_Money_Flow_Sum > 348473 )
			if( Positive_Money_Flow_Sum <= 9.12712e+06 )
				if( Typical_Price <= 15.2598 )
					if( ad <= -12031.8 )
						if( Positive_Money_Flow_Sum <= 2.80302e+06 )
							if( Positive_Money_Flow_Sum <= 1.39073e+06 )
								if( Positive_Money_Flow_Sum <= 235383 )
									ret := 0.807692 // buy
								if( Positive_Money_Flow_Sum > 235383 )
									ret := 0.201923
							if( Positive_Money_Flow_Sum > 1.39073e+06 )
								if( ad_mf <= -20549.9 )
									ret := 0.367089
								if( ad_mf > -20549.9 )
									ret := 0.700637 // buy
						if( Positive_Money_Flow_Sum > 2.80302e+06 )
							if( MFI_High <= -15.2891 )
								if( Raw_Money_Flow <= 1.34843e+06 )
									ret := -0.344828
								if( Raw_Money_Flow > 1.34843e+06 )
									ret := 0.857143 // buy
							if( MFI_High > -15.2891 )
								if( Negative_Money_Flow_Sum <= 1.72788e+06 )
									ret := 0.080000
								if( Negative_Money_Flow_Sum > 1.72788e+06 )
									ret := 0.869565 // buy
					if( ad > -12031.8 )
						if( Typical_Price <= 14.7288 )
							if( MFI_Low <= -15.366 )
								if( Negative_Money_Flow <= 61086.5 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 61086.5 )
									ret := 1.000000 // buy
							if( MFI_Low > -15.366 )
								if( Negative_Money_Flow_Sum <= 3.02679e+06 )
									ret := -0.058394
								if( Negative_Money_Flow_Sum > 3.02679e+06 )
									ret := 0.239669
						if( Typical_Price > 14.7288 )
							if( mf <= -0.09363 )
								if( Positive_Money_Flow_Sum <= 636139 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 636139 )
									ret := 0.384615
							if( mf > -0.09363 )
								if( ad <= 12128.2 )
									ret := 0.250000
								if( ad > 12128.2 )
									ret := -0.205882
				if( Typical_Price > 15.2598 )
					if( Negative_Money_Flow_Sum <= 1.0154e+07 )
						if( Raw_Money_Flow <= 10503.7 )
							if( Positive_Money_Flow_Sum <= 72034 )
								if( Raw_Money_Flow <= 2059.07 )
									ret := -0.500000
								if( Raw_Money_Flow > 2059.07 )
									ret := 0.653061
							if( Positive_Money_Flow_Sum > 72034 )
								if( Positive_Money_Flow_Sum <= 231136 )
									ret := 0.257426
								if( Positive_Money_Flow_Sum > 231136 )
									ret := -0.022727
						if( Raw_Money_Flow > 10503.7 )
							if( Positive_Money_Flow_Sum <= 2.53099e+06 )
								if( Negative_Money_Flow <= 2.47142e+06 )
									ret := 0.004204
								if( Negative_Money_Flow > 2.47142e+06 )
									ret := -0.472727
							if( Positive_Money_Flow_Sum > 2.53099e+06 )
								if( Negative_Money_Flow_Sum <= 4.47768e+06 )
									ret := 0.092381
								if( Negative_Money_Flow_Sum > 4.47768e+06 )
									ret := -0.019963
					if( Negative_Money_Flow_Sum > 1.0154e+07 )
						if( mf <= -0.370695 )
							if( Negative_Money_Flow_Sum <= 1.13078e+07 )
								if( Typical_Price <= 17.0188 )
									ret := -0.866667 // sell
								if( Typical_Price > 17.0188 )
									ret := 0.259259
							if( Negative_Money_Flow_Sum > 1.13078e+07 )
								if( Negative_Money_Flow_Sum <= 1.52721e+07 )
									ret := 0.767123 // buy
								if( Negative_Money_Flow_Sum > 1.52721e+07 )
									ret := 0.433071
						if( mf > -0.370695 )
							if( Negative_Money_Flow_Sum <= 1.33579e+07 )
								if( Raw_Money_Flow <= 523657 )
									ret := -0.024691
								if( Raw_Money_Flow > 523657 )
									ret := 0.416667
							if( Negative_Money_Flow_Sum > 1.33579e+07 )
								if( Negative_Money_Flow <= 2.7439e+06 )
									ret := -0.058957
								if( Negative_Money_Flow > 2.7439e+06 )
									ret := 0.293750
			if( Positive_Money_Flow_Sum > 9.12712e+06 )
				if( ad_mf <= -119380 )
					if( Positive_Money_Flow_Sum <= 1.58264e+07 )
						if( Typical_Price <= 21.2858 )
							if( Negative_Money_Flow_Sum <= 9.63224e+06 )
								ret := 0.400000
							if( Negative_Money_Flow_Sum > 9.63224e+06 )
								if( Typical_Price <= 15.4913 )
									ret := 0.428571
								if( Typical_Price > 15.4913 )
									ret := 0.931034 // buy
						if( Typical_Price > 21.2858 )
							if( Typical_Price <= 22.1789 )
								ret := -0.666667
							if( Typical_Price > 22.1789 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.58264e+07 )
						if( Negative_Money_Flow_Sum <= 2.86256e+07 )
							if( MFI_High <= -12.9782 )
								if( mf <= 0.060495 )
									ret := -0.111111
								if( mf > 0.060495 )
									ret := -0.800000 // sell
							if( MFI_High > -12.9782 )
								if( Positive_Money_Flow_Sum <= 3.54357e+07 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 3.54357e+07 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.86256e+07 )
							if( MFI_Low <= 15.7643 )
								ret := 1.000000 // buy
							if( MFI_Low > 15.7643 )
								ret := 0.666667
				if( ad_mf > -119380 )
					if( mf <= -0.07637 )
						if( Positive_Money_Flow_Sum <= 3.55923e+07 )
							if( Typical_Price <= 21.2523 )
								if( Raw_Money_Flow <= 346066 )
									ret := 0.057692
								if( Raw_Money_Flow > 346066 )
									ret := 0.718182 // buy
							if( Typical_Price > 21.2523 )
								if( Negative_Money_Flow_Sum <= 1.34422e+07 )
									ret := 0.558442
								if( Negative_Money_Flow_Sum > 1.34422e+07 )
									ret := -0.615385
						if( Positive_Money_Flow_Sum > 3.55923e+07 )
							if( Negative_Money_Flow <= 82612.8 )
								ret := 0.285714
							if( Negative_Money_Flow > 82612.8 )
								ret := 1.000000 // buy
					if( mf > -0.07637 )
						if( Raw_Money_Flow <= 547614 )
							if( Typical_Price <= 21.2964 )
								if( Raw_Money_Flow <= 450382 )
									ret := 0.277978
								if( Raw_Money_Flow > 450382 )
									ret := 0.784314 // buy
							if( Typical_Price > 21.2964 )
								if( Positive_Money_Flow_Sum <= 1.0827e+07 )
									ret := -0.590909
								if( Positive_Money_Flow_Sum > 1.0827e+07 )
									ret := 0.191011
						if( Raw_Money_Flow > 547614 )
							if( Positive_Money_Flow_Sum <= 1.22715e+07 )
								if( Negative_Money_Flow <= 565072 )
									ret := -0.600000
								if( Negative_Money_Flow > 565072 )
									ret := 0.232500
							if( Positive_Money_Flow_Sum > 1.22715e+07 )
								if( Positive_Money_Flow_Sum <= 1.60249e+07 )
									ret := -0.209964
								if( Positive_Money_Flow_Sum > 1.60249e+07 )
									ret := 0.144487
	if( Positive_Money_Flow > 12.6744 )
		if( Raw_Money_Flow <= 30310.9 )
			if( Negative_Money_Flow <= 79.192 )
				if( ad <= -0.965676 )
					if( MFI_Low <= 51.8263 )
						if( Typical_Price <= 13.8209 )
							ret := -1.000000 // sell
						if( Typical_Price > 13.8209 )
							if( Negative_Money_Flow_Sum <= 620404 )
								if( Positive_Money_Flow_Sum <= 51911.6 )
									ret := 0.375796
								if( Positive_Money_Flow_Sum > 51911.6 )
									ret := 0.114607
							if( Negative_Money_Flow_Sum > 620404 )
								if( Positive_Money_Flow_Sum <= 1.22614e+06 )
									ret := -0.270270
								if( Positive_Money_Flow_Sum > 1.22614e+06 )
									ret := 0.194444
					if( MFI_Low > 51.8263 )
						if( MFI <= 79.1648 )
							if( Positive_Money_Flow_Sum <= 72752.9 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 72752.9 )
								if( ad_mf <= -1340.42 )
									ret := 0.166667
								if( ad_mf > -1340.42 )
									ret := -0.568966
						if( MFI > 79.1648 )
							if( ad <= -331.778 )
								if( Positive_Money_Flow <= 9611.25 )
									ret := 0.642857
								if( Positive_Money_Flow > 9611.25 )
									ret := -0.057971
							if( ad > -331.778 )
								if( Money_Flow_Ratio <= 5.44016 )
									ret := 0.000000
								if( Money_Flow_Ratio > 5.44016 )
									ret := -0.800000 // sell
				if( ad > -0.965676 )
					if( MFI_Low <= 12.7097 )
						if( mf <= -0.362558 )
							if( Positive_Money_Flow <= 1640.62 )
								if( MFI_Low <= -0.261732 )
									ret := 1.000000 // buy
								if( MFI_Low > -0.261732 )
									ret := 0.285714
							if( Positive_Money_Flow > 1640.62 )
								if( Typical_Price <= 21.5925 )
									ret := 0.171674
								if( Typical_Price > 21.5925 )
									ret := -0.157143
						if( mf > -0.362558 )
							if( Negative_Money_Flow_Sum <= 165985 )
								if( Negative_Money_Flow_Sum <= 150153 )
									ret := -0.062500
								if( Negative_Money_Flow_Sum > 150153 )
									ret := 0.338235
							if( Negative_Money_Flow_Sum > 165985 )
								if( Negative_Money_Flow_Sum <= 215498 )
									ret := -0.426667
								if( Negative_Money_Flow_Sum > 215498 )
									ret := -0.108963
					if( MFI_Low > 12.7097 )
						if( Typical_Price <= 13.845 )
							if( Positive_Money_Flow <= 14210.4 )
								if( Positive_Money_Flow <= 5089.02 )
									ret := 0.000000
								if( Positive_Money_Flow > 5089.02 )
									ret := 0.500000
							if( Positive_Money_Flow > 14210.4 )
								if( MFI_High <= -37.0322 )
									ret := 0.750000 // buy
								if( MFI_High > -37.0322 )
									ret := 1.000000 // buy
						if( Typical_Price > 13.845 )
							if( ad <= 6.18347 )
								if( ad_mf <= 0.430814 )
									ret := -0.181543
								if( ad_mf > 0.430814 )
									ret := 0.034247
							if( ad > 6.18347 )
								if( Negative_Money_Flow_Sum <= 267862 )
									ret := -0.400171
								if( Negative_Money_Flow_Sum > 267862 )
									ret := -0.072650
			if( Negative_Money_Flow > 79.192 )
				if( MFI_High <= -74.7701 )
					if( Positive_Money_Flow <= 2018.86 )
						if( Negative_Money_Flow_Sum <= 1.5165e+06 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.5165e+06 )
							if( Positive_Money_Flow_Sum <= 110818 )
								if( Positive_Money_Flow <= 1183.51 )
									ret := 0.000000
								if( Positive_Money_Flow > 1183.51 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 110818 )
								ret := 0.600000
					if( Positive_Money_Flow > 2018.86 )
						ret := 1.000000 // buy
				if( MFI_High > -74.7701 )
					if( mf <= -0.01655 )
						if( Typical_Price <= 13.7918 )
							if( Positive_Money_Flow_Sum <= 177036 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 177036 )
								ret := 0.000000
						if( Typical_Price > 13.7918 )
							if( ad_mf <= 0.075504 )
								if( MFI_Low <= -9.37096 )
									ret := -0.333333
								if( MFI_Low > -9.37096 )
									ret := 0.473214
							if( ad_mf > 0.075504 )
								if( Negative_Money_Flow_Sum <= 169182 )
									ret := 0.010830
								if( Negative_Money_Flow_Sum > 169182 )
									ret := 0.322176
					if( mf > -0.01655 )
						if( ad <= -1091.66 )
							if( ad <= -1495.27 )
								ret := 0.500000
							if( ad > -1495.27 )
								ret := 1.000000 // buy
						if( ad > -1091.66 )
							if( Typical_Price <= 17.862 )
								if( Positive_Money_Flow_Sum <= 334238 )
									ret := -0.150442
								if( Positive_Money_Flow_Sum > 334238 )
									ret := -0.595745
							if( Typical_Price > 17.862 )
								if( Negative_Money_Flow_Sum <= 2.14646e+06 )
									ret := 0.117241
								if( Negative_Money_Flow_Sum > 2.14646e+06 )
									ret := -0.857143 // sell
		if( Raw_Money_Flow > 30310.9 )
			if( mf <= -0.428244 )
				if( Negative_Money_Flow_Sum <= 3.40274e+06 )
					if( MFI_High <= -70.0283 )
						if( Raw_Money_Flow <= 61354.9 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 61354.9 )
							ret := -0.750000 // sell
					if( MFI_High > -70.0283 )
						if( Typical_Price <= 15.2494 )
							if( Positive_Money_Flow <= 124919 )
								if( ad_mf <= 0.717097 )
									ret := 1.000000 // buy
								if( ad_mf > 0.717097 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow > 124919 )
								if( Money_Flow_Ratio <= 0.954752 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 0.954752 )
									ret := 1.000000 // buy
						if( Typical_Price > 15.2494 )
							if( Raw_Money_Flow <= 1.62159e+06 )
								if( ad_mf <= -18168.9 )
									ret := 1.000000 // buy
								if( ad_mf > -18168.9 )
									ret := 0.091954
							if( Raw_Money_Flow > 1.62159e+06 )
								ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 3.40274e+06 )
					if( Positive_Money_Flow_Sum <= 1.02839e+06 )
						if( Typical_Price <= 20.5533 )
							if( Positive_Money_Flow_Sum <= 637285 )
								if( mf <= -0.448042 )
									ret := 0.966667 // buy
								if( mf > -0.448042 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 637285 )
								if( Raw_Money_Flow <= 171616 )
									ret := 0.000000
								if( Raw_Money_Flow > 171616 )
									ret := 0.866667 // buy
						if( Typical_Price > 20.5533 )
							if( ad_mf <= 2588.06 )
								ret := 0.250000
							if( ad_mf > 2588.06 )
								ret := 0.500000
					if( Positive_Money_Flow_Sum > 1.02839e+06 )
						if( MFI_Low <= -13.2687 )
							if( Money_Flow_Ratio <= 0.059929 )
								if( ad_mf <= 0.831949 )
									ret := 1.000000 // buy
								if( ad_mf > 0.831949 )
									ret := -0.250000
							if( Money_Flow_Ratio > 0.059929 )
								if( Positive_Money_Flow_Sum <= 2.32653e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.32653e+06 )
									ret := -0.500000
						if( MFI_Low > -13.2687 )
							if( ad <= 81032.8 )
								if( Positive_Money_Flow_Sum <= 4.39001e+06 )
									ret := 0.340741
								if( Positive_Money_Flow_Sum > 4.39001e+06 )
									ret := 0.760870 // buy
							if( ad > 81032.8 )
								ret := -1.000000 // sell
			if( mf > -0.428244 )
				if( Negative_Money_Flow_Sum <= 50832.3 )
					if( ad_mf <= -4692.4 )
						if( mf <= -0.194789 )
							ret := 1.000000 // buy
						if( mf > -0.194789 )
							if( Negative_Money_Flow_Sum <= 40268 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 40268 )
								ret := 0.500000
					if( ad_mf > -4692.4 )
						if( MFI <= 96.2541 )
							if( MFI_Low <= 48.3078 )
								if( Raw_Money_Flow <= 30977.4 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 30977.4 )
									ret := -0.263158
							if( MFI_Low > 48.3078 )
								if( mf <= -0.385343 )
									ret := 0.400000
								if( mf > -0.385343 )
									ret := -0.506173
						if( MFI > 96.2541 )
							if( Positive_Money_Flow_Sum <= 3.58925e+06 )
								if( Positive_Money_Flow_Sum <= 1.33257e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.33257e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.58925e+06 )
								if( MFI_High <= 19.2107 )
									ret := -0.500000
								if( MFI_High > 19.2107 )
									ret := -0.800000 // sell
				if( Negative_Money_Flow_Sum > 50832.3 )
					if( Positive_Money_Flow_Sum <= 5.04326e+06 )
						if( Money_Flow_Ratio <= 0.154029 )
							if( Positive_Money_Flow <= 721871 )
								if( Positive_Money_Flow_Sum <= 756623 )
									ret := 0.334821
								if( Positive_Money_Flow_Sum > 756623 )
									ret := -0.095238
							if( Positive_Money_Flow > 721871 )
								if( mf <= -0.176691 )
									ret := 1.000000 // buy
								if( mf > -0.176691 )
									ret := 0.736842 // buy
						if( Money_Flow_Ratio > 0.154029 )
							if( Raw_Money_Flow <= 1.6026e+06 )
								if( ad <= 55015.5 )
									ret := 0.017836
								if( ad > 55015.5 )
									ret := 0.427350
							if( Raw_Money_Flow > 1.6026e+06 )
								if( ad <= 113578 )
									ret := -0.317757
								if( ad > 113578 )
									ret := 0.448276
					if( Positive_Money_Flow_Sum > 5.04326e+06 )
						if( Negative_Money_Flow_Sum <= 1.24974e+07 )
							if( Typical_Price <= 22.5653 )
								if( Positive_Money_Flow_Sum <= 2.24447e+07 )
									ret := 0.132884
								if( Positive_Money_Flow_Sum > 2.24447e+07 )
									ret := 0.487097
							if( Typical_Price > 22.5653 )
								if( MFI_Low <= 48.2157 )
									ret := 0.121469
								if( MFI_Low > 48.2157 )
									ret := -0.236010
						if( Negative_Money_Flow_Sum > 1.24974e+07 )
							if( MFI_Low <= 37.5198 )
								if( Typical_Price <= 23.0783 )
									ret := 0.020877
								if( Typical_Price > 23.0783 )
									ret := -0.755556 // sell
							if( MFI_Low > 37.5198 )
								if( ad <= 51157.5 )
									ret := -0.811765 // sell
								if( ad > 51157.5 )
									ret := -0.277778
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_U_1Min_5d9a53ac(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


